package X;

import android.util.Patterns;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.0mt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC13670mt {
    public static final Pattern A00;
    public static final Pattern A01;
    public static final Pattern A03;
    public static final Pattern A04;
    public static final Pattern A05;
    public static final Pattern A06;
    public static final Pattern A07;
    public static final InterfaceC09390do A08;
    public static final InterfaceC09390do A09;
    public static final Pattern A0A = Pattern.compile("\\s+");
    public static final Pattern A02 = Pattern.compile("((?<=(^|\\W))((\uf000[a-z0-9_]+(\\.[a-z0-9_]+)*)|(\uf000)))", 2);

    public static final String A03(String str) {
        char c;
        C14360o3.A0B(str, 0);
        char[] charArray = str.toCharArray();
        C14360o3.A07(charArray);
        int length = charArray.length;
        for (int i = 0; i < length; i++) {
            char c2 = charArray[i];
            if (c2 != 195 && c2 != 193) {
                if (c2 != 227 && c2 != 225) {
                    if (c2 != 213 && c2 != 211) {
                        if (c2 != 245 && c2 != 243) {
                            if (c2 == 199) {
                                c = 'C';
                            } else if (c2 == 231) {
                                c = 'c';
                            } else if (c2 != 202 && c2 != 201) {
                                if (c2 != 234 && c2 != 233) {
                                    if (c2 == 218) {
                                        c = 'U';
                                    } else if (c2 == 250) {
                                        c = 'u';
                                    }
                                } else {
                                    c = 'e';
                                }
                            } else {
                                c = 'E';
                            }
                        } else {
                            c = 'o';
                        }
                    } else {
                        c = 'O';
                    }
                } else {
                    c = 'a';
                }
            } else {
                c = 'A';
            }
            charArray[i] = Character.valueOf(c).charValue();
        }
        return new String(charArray);
    }

    public static final String A04(String str, int i) {
        C14360o3.A0B(str, 0);
        if (i < str.length()) {
            String substring = str.substring(0, i);
            C14360o3.A07(substring);
            return AnonymousClass001.A0C(substring, (char) 8230);
        }
        return str;
    }

    public static final String A06(String str, Object... objArr) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(objArr, 1);
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        String format = String.format(null, str, Arrays.copyOf(copyOf, copyOf.length));
        C14360o3.A07(format);
        return format;
    }

    public static final ArrayList A07(CharSequence charSequence) {
        C14360o3.A0B(charSequence, 0);
        ArrayList arrayList = new ArrayList();
        Object value = A09.getValue();
        C14360o3.A07(value);
        Matcher matcher = ((Pattern) value).matcher(charSequence);
        while (matcher.find()) {
            arrayList.add(Integer.valueOf(matcher.start()));
        }
        return arrayList;
    }

    public static final HashMap A08(String str, InterfaceC16660sJ interfaceC16660sJ) {
        List list;
        List list2;
        Object invoke;
        boolean z = false;
        if (str.length() == 0) {
            z = true;
        }
        HashMap hashMap = null;
        if (!z) {
            List A032 = new C11L(";").A03(str);
            if (!A032.isEmpty()) {
                ListIterator listIterator = A032.listIterator(A032.size());
                while (listIterator.hasPrevious()) {
                    if (((String) listIterator.previous()).length() != 0) {
                        list = AbstractC001800i.A0d(A032, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            list = C16930sl.A00;
            String[] strArr = (String[]) list.toArray(new String[0]);
            int length = strArr.length;
            if (length != 0) {
                hashMap = new HashMap(length);
                for (String str2 : strArr) {
                    List A033 = new C11L(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1).A03(str2);
                    if (!A033.isEmpty()) {
                        ListIterator listIterator2 = A033.listIterator(A033.size());
                        while (listIterator2.hasPrevious()) {
                            if (((String) listIterator2.previous()).length() != 0) {
                                list2 = AbstractC001800i.A0d(A033, listIterator2.nextIndex() + 1);
                                break;
                            }
                        }
                    }
                    list2 = C16930sl.A00;
                    String[] strArr2 = (String[]) list2.toArray(new String[0]);
                    if (strArr2.length == 2 && (invoke = interfaceC16660sJ.invoke(strArr2[1])) != null) {
                        hashMap.put(strArr2[0], invoke);
                    }
                }
            }
        }
        return hashMap;
    }

    public static final boolean A0B(CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0) {
            return true;
        }
        Iterable c17u = new C17u(0, charSequence.length() - 1);
        if ((c17u instanceof Collection) && ((Collection) c17u).isEmpty()) {
            return true;
        }
        Iterator it = c17u.iterator();
        while (it.hasNext()) {
            if (!Character.isWhitespace(charSequence.charAt(((AbstractC16880sg) it).A00()))) {
                return false;
            }
        }
        return true;
    }

    public static final boolean A0C(CharSequence charSequence) {
        boolean z = false;
        if (charSequence == null || charSequence.length() == 0) {
            return false;
        }
        String obj = charSequence.toString();
        int length = obj.length() - 1;
        int i = 0;
        while (i <= length) {
            int i2 = length;
            if (!z) {
                i2 = i;
            }
            int A002 = C14360o3.A00(obj.charAt(i2), 32);
            boolean z2 = false;
            if (A002 <= 0) {
                z2 = true;
            }
            if (!z) {
                if (!z2) {
                    z = true;
                } else {
                    i++;
                }
            } else {
                if (!z2) {
                    break;
                }
                length--;
            }
        }
        return Patterns.EMAIL_ADDRESS.matcher(obj.subSequence(i, length + 1).toString()).matches();
    }

    public static final boolean A0D(String str) {
        C14360o3.A0B(str, 0);
        if (str.length() != 0 && A00(str) == 1) {
            Object value = A08.getValue();
            C14360o3.A07(value);
            if (((Pattern) value).matcher(str).matches()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean A0E(String str) {
        int length;
        if (str == null || (length = str.length()) == 0 || str.codePointCount(0, length - 1) > 10) {
            return false;
        }
        Object value = A08.getValue();
        C14360o3.A07(value);
        return ((Pattern) value).matcher(str).matches();
    }

    public static final boolean A0H(String str, String str2) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str2, 1);
        int length = str.length() - str2.length();
        if (length >= 0) {
            int i = 0;
            while (!A0I(str, str2, i)) {
                while (i != length) {
                    i++;
                    if (i == 0 || Character.isWhitespace(str.charAt(i - 1))) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static final boolean A0I(String str, String str2, int i) {
        int i2;
        if (str == null || str2 == null) {
            return false;
        }
        int length = str.length();
        int length2 = str2.length();
        if (i + length2 > length) {
            return false;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < length2; i4++) {
            if (!Character.isWhitespace(str2.charAt(i4))) {
                while (true) {
                    i2 = i + i4 + i3;
                    if (i2 >= length || !Character.isWhitespace(str.charAt(i2))) {
                        break;
                    }
                    i3++;
                }
                if (i2 >= length || Character.toLowerCase(str.charAt(i2)) != Character.toLowerCase(str2.charAt(i4))) {
                    return false;
                }
            }
        }
        return true;
    }

    static {
        Pattern compile = Pattern.compile("((?<=(^|\\W))(@[a-z0-9_]+(\\.[a-z0-9_]+)*))", 2);
        C14360o3.A07(compile);
        A04 = compile;
        Pattern compile2 = Pattern.compile("(@\\[\\][\\u200a]?[0-9]+)", 2);
        C14360o3.A07(compile2);
        A05 = compile2;
        Pattern compile3 = Pattern.compile("(@[a-z0-9_]+(\\.[a-z0-9_]+)*)", 2);
        C14360o3.A07(compile3);
        A03 = compile3;
        Pattern compile4 = Pattern.compile("((?<=(^|\\W))(#[a-z0-9_]+(\\.[a-z0-9_]+)*))", 2);
        C14360o3.A07(compile4);
        A01 = compile4;
        Pattern compile5 = Pattern.compile("[\u2000-\u200a\u3000]+");
        C14360o3.A07(compile5);
        A07 = compile5;
        Pattern compile6 = Pattern.compile("\\$((\\d{1,3}(,\\d{3})*)|\\d+)(\\.\\d{1,2})?(?=\\s|\\.\\s|\\,\\s|$|\\.$|\\,$|\\?|\\!)", 2);
        C14360o3.A07(compile6);
        A00 = compile6;
        Pattern compile7 = Pattern.compile("^https?://www\\.threads\\.net/@([\\w\\-\\.]+)/post/([\\w\\-]+)/.*$", 2);
        C14360o3.A07(compile7);
        A06 = compile7;
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        A08 = AbstractC09440dt.A00(enumC09460dv, C04850Ne.A00);
        A09 = AbstractC09440dt.A00(enumC09460dv, C04840Nc.A00);
    }

    public static final String A01(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        String obj = charSequence.toString();
        int length = obj.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            int i2 = length;
            if (!z) {
                i2 = i;
            }
            int A002 = C14360o3.A00(obj.charAt(i2), 32);
            boolean z2 = false;
            if (A002 <= 0) {
                z2 = true;
            }
            if (!z) {
                if (!z2) {
                    z = true;
                } else {
                    i++;
                }
            } else {
                if (!z2) {
                    break;
                }
                length--;
            }
        }
        return A0A.matcher(obj.subSequence(i, length + 1).toString()).replaceAll(" ");
    }

    public static final String A02(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.reset();
            byte[] bytes = str.getBytes(C15W.A05);
            C14360o3.A07(bytes);
            messageDigest.update(bytes);
            byte[] digest = messageDigest.digest();
            C14360o3.A0A(digest);
            C14360o3.A0B(digest, 0);
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                String hexString = Integer.toHexString((b & 255) | 256);
                C14360o3.A07(hexString);
                String substring = hexString.substring(1, 3);
                C14360o3.A07(substring);
                sb.append(substring);
            }
            String obj = sb.toString();
            C14360o3.A07(obj);
            return obj;
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static final String A05(String str, Collection collection) {
        if (collection != null && !collection.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            boolean z = true;
            for (Object obj : collection) {
                if (z) {
                    z = false;
                } else {
                    sb.append(str);
                }
                if (obj != null) {
                    sb.append(obj.toString());
                }
            }
            return sb.toString();
        }
        return null;
    }

    public static final Matcher A09(String str) {
        Matcher matcher = A04.matcher(str);
        C14360o3.A07(matcher);
        return matcher;
    }

    public static final boolean A0A(CharSequence charSequence) {
        Object value = A09.getValue();
        C14360o3.A07(value);
        return ((Pattern) value).matcher(charSequence).find();
    }

    public static final boolean A0F(String str, String str2) {
        Locale locale = Locale.ROOT;
        String lowerCase = str.toLowerCase(locale);
        C14360o3.A07(lowerCase);
        String lowerCase2 = str2.toLowerCase(locale);
        C14360o3.A07(lowerCase2);
        int i = 0;
        for (int i2 = 0; i2 < lowerCase.length() && i < lowerCase2.length(); i2++) {
            if (lowerCase.charAt(i2) == lowerCase2.charAt(i)) {
                i++;
            }
        }
        if (i != lowerCase2.length()) {
            return false;
        }
        return true;
    }

    public static final boolean A0G(String str, String str2) {
        if (str == null) {
            if (str2 != null) {
                return false;
            }
            return true;
        }
        return str.equals(str2);
    }

    public static final int A00(String str) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        int i = 0;
        while (characterInstance.next() != -1) {
            i++;
        }
        return i;
    }
}
