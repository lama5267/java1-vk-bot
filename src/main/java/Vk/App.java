package Vk;


import com.javastream.vk_api_javastream.utils.Util;
import com.vk.api.sdk.client.TransportClient;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.exceptions.ApiException;
import com.vk.api.sdk.exceptions.ClientException;
import com.vk.api.sdk.httpclient.HttpTransportClient;
import com.vk.api.sdk.objects.messages.*;
import com.vk.api.sdk.objects.photos.Photo;
import com.vk.api.sdk.objects.photos.PhotoUpload;
import com.vk.api.sdk.queries.messages.MessagesGetLongPollHistoryQuery;
import org.json.JSONObject;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.*;

class App {
    private static GroupActor actor;
    private static VkApiClient vk;
    private static Keyboard keyboard = new Keyboard();


    private static void accept(Message message) {
        if (!message.isOut()) {
            System.out.println(message.toString());

            try {
                if (message.getText().toLowerCase().equals("привет")){
                    sendMessage("Привет я бот игра! Нажми на алфавит или приз", message); }
                else
                if (message.getText().toLowerCase().contains("пока")){
                    sendMessage("Удачи!", message);  return;
                }else if (message.getText().toLowerCase().contains("алфавит")) { File file = new File("D:\\Алфавит.jpg");
                    sendPhotoMessage( "1 уровень Алфавит нужно писать по одной  букве напиши букву А или а",file, message);return;}

                else if (message.getText().toLowerCase().equals("а")) { File file = new File("D:\\А.jpg");
                    sendPhotoMessage("Молодец! Теперь напиши  букву Б б", file, message);return;}
                else if (message.getText().toLowerCase().equals("б")) { File file = new File("D:\\Б.jpg");
                    sendPhotoMessage( "Молодец! Теперь напиши  букву В в",file, message);
                }else if (message.getText().toLowerCase().equals("в")) { File file = new File("D:\\В.jpg");
                    sendPhotoMessage("Молодец! Теперь напиши  букву Г г", file, message);}
                else if (message.getText().toLowerCase().equals("г")) { File file = new File("D:\\Г.jpg");
                    sendPhotoMessage( "Молодец! Теперь напиши  букву Д д",file, message);
                }else if (message.getText().toLowerCase().equals("д")) { File file = new File("D:\\Д.jpg");
                    sendPhotoMessage("Молодец! Теперь напиши  букву Е е", file, message);}
                else if (message.getText().toLowerCase().equals("е")) { File file = new File("D:\\Е.jpg");
                    sendPhotoMessage( "Молодец! Теперь напиши  букву Ё ё",file, message);
                }else if (message.getText().toLowerCase().equals("ё")) { File file = new File("D:\\Ё.jpg");
                    sendPhotoMessage("Молодец! Теперь напиши  букву Ж ж", file, message);}
                else if (message.getText().toLowerCase().equals("ж")) { File file = new File("D:\\Ж.jpg");
                    sendPhotoMessage( "Молодец! Теперь напиши  букву З з",file, message);
                }else if (message.getText().toLowerCase().equals("з")) { File file = new File("D:\\З.jpg");
                    sendPhotoMessage("Молодец! Теперь напиши  букву И и", file, message);}
                else if (message.getText().toLowerCase().equals("и")) { File file = new File("D:\\И.jpg");
                    sendPhotoMessage( "Молодец! Теперь напиши  букву Й й",file, message);
                }else if (message.getText().toLowerCase().equals("й")) { File file = new File("D:\\Й.jpg");
                    sendPhotoMessage("Молодец! Теперь напиши  букву К к", file, message);}
                else if (message.getText().toLowerCase().equals("к")) { File file = new File("D:\\К.jpg");
                    sendPhotoMessage( "Молодец! Теперь напиши  букву Л л",file, message);
                }else if (message.getText().toLowerCase().equals("л")) { File file = new File("D:\\Л.jpg");
                    sendPhotoMessage("Молодец! Теперь напиши  букву М м", file, message);}
                else if (message.getText().toLowerCase().equals("м")) { File file = new File("D:\\М.jpg");
                    sendPhotoMessage( "Молодец! Теперь напиши  букву Н н",file, message);
                }else if (message.getText().toLowerCase().equals("н")) { File file = new File("D:\\Н.jpg");
                    sendPhotoMessage("Молодец! Теперь напиши  букву О о", file, message);}
                else if (message.getText().toLowerCase().equals("о")) { File file = new File("D:\\О.jpg");
                    sendPhotoMessage( "Молодец! Теперь напиши  букву П п",file, message);
                }else if (message.getText().toLowerCase().equals("п")) { File file = new File("D:\\П.jpg");
                    sendPhotoMessage("Молодец! Теперь напиши  букву Р р", file, message);}
                else if (message.getText().toLowerCase().equals("р")) { File file = new File("D:\\Р.jpg");
                    sendPhotoMessage( "Молодец! Теперь напиши  букву С с",file, message);
                }else if (message.getText().toLowerCase().equals("с")) { File file = new File("D:\\С.jpg");
                    sendPhotoMessage("Молодец! Теперь напиши  букву Т т", file, message);}
                else if (message.getText().toLowerCase().equals("т")) { File file = new File("D:\\Т.jpg");
                    sendPhotoMessage( "Молодец! Теперь напиши  букву У у",file, message);
                }else if (message.getText().toLowerCase().equals("у")) { File file = new File("D:\\У.jpg");
                    sendPhotoMessage("Молодец! Теперь напиши  букву Ф ф", file, message);}
                else if (message.getText().toLowerCase().equals("ф")) { File file = new File("D:\\Ф.jpg");
                    sendPhotoMessage( "Молодец! Теперь напиши  букву Х х",file, message);
                }else if (message.getText().toLowerCase().equals("х")) { File file = new File("D:\\Х.jpg");
                    sendPhotoMessage("Молодец! Теперь напиши  букву Ц ц", file, message);}
                else if (message.getText().toLowerCase().equals("ц")) { File file = new File("D:\\Ц.jpg");
                    sendPhotoMessage( "Молодец! Теперь напиши  букву Ч ч",file, message);
                }else if (message.getText().toLowerCase().equals("ч")) { File file = new File("D:\\Ч.jpg");
                    sendPhotoMessage("Молодец! Теперь напиши  букву Ш ш", file, message);}
                else if (message.getText().toLowerCase().equals("ш")) { File file = new File("D:\\Ш.jpg");
                    sendPhotoMessage( "Молодец! Теперь напиши  букву Щ щ",file, message);
                }else if (message.getText().toLowerCase().equals("щ")) { File file = new File("D:\\Щ.jpg");
                    sendPhotoMessage("Молодец! Теперь напиши  букву Ъ ъ", file, message);}
                else if (message.getText().toLowerCase().equals("ъ")) { File file = new File("D:\\Ъ.jpg");
                    sendPhotoMessage( "Молодец! Теперь напиши  букву Ы ы",file, message);
                }else if (message.getText().toLowerCase().equals("ы")) { File file = new File("D:\\Ы.jpg");
                    sendPhotoMessage("Молодец! Теперь напиши  букву Ь ь", file, message);}
                else if (message.getText().toLowerCase().equals("ь")) { File file = new File("D:\\Ь.jpg");
                    sendPhotoMessage( "Молодец! Теперь напиши  букву Э э",file, message);
                }else if (message.getText().toLowerCase().equals("э")) { File file = new File("D:\\Э.jpg");
                    sendPhotoMessage("Молодец! Теперь напиши  букву Ю ю", file, message);}
                else if (message.getText().toLowerCase().equals("ю")) { File file = new File("D:\\Ю.jpg");
                    sendPhotoMessage("Молодец! Теперь напиши  букву Я я", file, message);}
                else if (message.getText().toLowerCase().contains("2")) { File file = new File("D:\\Пример1.jpg");
                    sendPhotoMessage("Молодец! Теперь реши пример 2+2= напиши  ответ цифрой 5 или 4 ", file, message);}
                else if (message.getText().toLowerCase().contains("4")) { File file = new File("D:\\Пример2.jpg");
                    sendPhotoMessage( "Молодец! Теперь последний примнер 3+3= напигши ответ цифрой 7 или 6",file, message);
                }                else if (message.getText().toLowerCase().equals("я")) { File file = new File("D:\\Я.jpg");
                    sendPhotoMessage( "Молодец! 1 уровень пройден Теперь реши пример 1+1= напиши ответ цифрой 2 или 3",file, message);}
                else if (message.getText().toLowerCase().contains("6")) { File file = new File("D:\\Пример3.jpg");
                    sendPhotoMessage( "Молодец! 2 уровень пройден. Теперь загадка. Ку-ка-ре-ку кричит он звонко,Хлопает крыльями громко-громко,\n" +
                            "\nКурочек верный пастух,\n" +
                            "\nКак зовут его (п...х).\n" +
                            "\n",file, message);}
                else if (message.getText().toLowerCase().contains("петух")) { File file = new File("D:\\Загадка1.jpg");
                    sendPhotoMessage( "Молодец! Последняя загадка до приза. Ночью он совсем не спит,\n" +
                            "\nДом от мышек сторожит,\n" +
                            "\n Молоко из миски пьёт,\n" +
                            "\nНу конечно это (к.т).\n" +
                            "\n",file, message);}
                else if (message.getText().toLowerCase().contains("кот")) { File file = new File("D:\\Ура.jpg");
                    sendPhotoMessage( "Молодец! Приз твой скажи маме пароль: Солнышко и она отдаст тебе приз",file, message);}
                else if (message.getText().toLowerCase().contains("солнышко")) { File file = new File("D:\\Солнышко.jpg");
                    sendPhotoMessage( "Приз у мамы я просто бот",file, message);}
                else if (message.getText().toLowerCase().contains("приз")) { File file = new File("D:\\Приз.jpg");
                    sendPhotoMessage( "Чтобы получить приз нужно пройти весь алфавит от А до Я решить три примера и отгадать две загадки",file, message);}
                 else  sendMessage("Нажми на алфавит или приз и узнай что нужно делать. Если не верно\n" +
                             "\nто вспомни последнюю букву которую нажимал.", message);return;
            } catch (ApiException | ClientException | IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void sendPhotoMessage(String text, File file, Message message) throws ClientException, ApiException, IOException {
        if (message == null) return;

        PhotoUpload uploadServer = vk.photos().getMessagesUploadServer(actor).execute();
        URL uploadUrl = uploadServer.getUploadUrl();

        JSONObject responce = Util.uploadFileToServer(uploadUrl, file);

        int serverJson = responce.getInt("server");
        String photo = responce.getString("photo");
        String hash = responce.getString("hash");

        List<Photo> photoList = vk.photos().saveMessagesPhoto(actor, photo).server(serverJson).hash(hash).execute();

        vk.messages()
                .send(actor)
                .peerId(message.getPeerId())
                .message(text)
                .attachment("photo" + photoList.get(0).getOwnerId() + "_" + photoList.get(0).getId())
                .randomId((int) (Math.random() * 2048))
                .executeAsRaw();
    }
    public static void sendMessage(String text, Message message) throws ClientException {
        if (message == null) return;
        vk.messages()
                .send(actor)
                .peerId(message.getPeerId())
                .message(text)
                .randomId((int) (Math.random() * 2048))
                .keyboard(keyboard)
                .executeAsRaw();
    }
    public static void main(String[] args) throws ClientException, ApiException, InterruptedException {
        TransportClient transportClient = new HttpTransportClient();
        vk = new VkApiClient(transportClient);

        Random random = new Random();


        List<List<KeyboardButton>> allKey = new ArrayList<>();

        List<KeyboardButton> line1 = new ArrayList<>();
        line1.add(new KeyboardButton().setAction(new KeyboardButtonAction().setLabel("Алфавит").setType(KeyboardButtonActionType.TEXT)).setColor(KeyboardButtonColor.POSITIVE));
        line1.add(new KeyboardButton().setAction(new KeyboardButtonAction().setLabel("Приз").setType(KeyboardButtonActionType.TEXT)).setColor(KeyboardButtonColor.NEGATIVE));

        //  List<KeyboardButton> line2 = new ArrayList<>();
        // line2.add(new KeyboardButton().setAction(new KeyboardButtonAction().setType(KeyboardButtonActionType.LOCATION)));

        allKey.add(line1);
        // allKey.add(line2);
        keyboard.setButtons(allKey);

        actor = new GroupActor(199598002, "");        Integer ts = vk.messages().getLongPollServer(actor).execute().getTs();

        while (true) {
            MessagesGetLongPollHistoryQuery historyQuery = vk.messages().getLongPollHistory(actor).ts(ts);
            List<Message> messages = historyQuery.execute().getMessages().getItems();
            if (!messages.isEmpty()) {

                messages.forEach(App::accept);

            }

            ts = vk.messages().getLongPollServer(actor).execute().getTs();
            Thread.sleep(2000);
        }

    }

}