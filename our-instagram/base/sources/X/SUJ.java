package X;

import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes10.dex */
public abstract class SUJ {
    public static final String[] A00;

    public static final boolean A00(String str) {
        C14360o3.A0B(str, 0);
        String[] strArr = A00;
        C14360o3.A0B(strArr, 0);
        Iterable c17u = new C17u(0, 150);
        if (!(c17u instanceof Collection) || !((Collection) c17u).isEmpty()) {
            Iterator it = c17u.iterator();
            while (it.hasNext()) {
                if (C14360o3.A0K(strArr[((AbstractC16880sg) it).A00()], str)) {
                    return true;
                }
            }
        }
        return false;
    }

    static {
        String[] strArr = new String[151];
        System.arraycopy(new String[]{"summer", "112233445566", "121212", "iloveu", "654321", "lovelove", "hello123", "asdfghjkl", "chicken", "1234512345", "aaaaaa", "lakers24", "fuckyou", "ihateyou", "998877", "harrystyles", "123456789", "123123123", "soccer", "iloveyou123", "1122334455", "password123", "vanessa", "cupcake", "12344321", "qwe123", "facebook"}, 0, strArr, 0, 27);
        System.arraycopy(new String[]{"fucklove", "bubbles", "password", "1q2w3e4r", "123123", "11223344", "123456123456", "111222", "123qwe", "butterfly", "cookies", "instagram", "spongebob", "fuckoff", "qwertyuiop", "bismillah", "lalala", "lol123", "flower", "destiny", "barbie", "555555", "hellokitty", "iloveme", "12345678910", "1234554321", "icecream"}, 0, strArr, 27, 27);
        System.arraycopy(new String[]{"daniel", "Aa123456", "101010", "jessica", "102030", "12341234", "jasmine", "cookie", "666666", "princess", "justin", "1234567890", "222222", "999999", "iloveyou", "009988", "abc123", "baseball", "zxcvbnm", "family", "098765", "instagram1", "babygirl", "taylor", "909090", "onedirection", "pokemon"}, 0, strArr, 54, 27);
        System.arraycopy(new String[]{"kobe24", "nicole", "qwerty123", "87654321", "basketball", "monkey", "1234566", "1234567", "lollipop", "lovely", "banana", "loveyou", "liverpool", "123654", "batman", "sunshine", "love1234", "chocolate", "12345678", "jordan", "asdfgh", "iloveyou1", "niallhoran", "ashley", "isabella", "spiderman", "sayang"}, 0, strArr, 81, 27);
        System.arraycopy(new String[]{"samsung", "hahaha", "12345", "beautiful", "password1", "fashion", "123abc", "098098", "awesome", "qwerty", "superman", "incorrect", "111111", "123456", "123321", "hannah", "zaynmalik", "0987654321", "112233", "qazwsx", "michelle", "elizabeth", "987654321", "football", "7777777", "cupcakes", "softball"}, 0, strArr, 108, 27);
        System.arraycopy(new String[]{"friends", "love123", "anthony", "forever", "loveme", "000000", "love12", "charlie", "barcelona", "forever21", "justinbieber", "purple", "jordan23", "rahasia", "123456654321", "bieber"}, 0, strArr, 135, 16);
        A00 = strArr;
    }
}
