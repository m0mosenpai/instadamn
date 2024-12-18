package X;

import java.util.ArrayList;
import java.util.regex.Pattern;

/* loaded from: classes10.dex */
public abstract class SV9 {
    public static final Pattern A00;
    public static final Pattern A01;
    public static final Pattern A02;
    public static final Pattern A03;
    public static final Pattern A04;
    public static final Pattern A05;

    public static final EnumC61188Rgo A00(String str) {
        if (str != null && str.length() != 0) {
            ArrayList A1E = AbstractC166987dD.A1E();
            for (EnumC61188Rgo enumC61188Rgo : EnumC61188Rgo.values()) {
                if (enumC61188Rgo != EnumC61188Rgo.A0A) {
                    A1E.add(enumC61188Rgo);
                }
            }
            String A002 = new C11L("[^\\d+]").A00(str, "");
            if (A002.length() != 0) {
                String A0s = AbstractC58319PtB.A0s(A002, "[^\\d+]", "");
                EnumC61188Rgo enumC61188Rgo2 = EnumC61188Rgo.A0B;
                if (A1E.contains(enumC61188Rgo2)) {
                    Pattern pattern = A05;
                    C14360o3.A08(pattern);
                    if (AbstractC31175DnJ.A1Z(A0s, pattern)) {
                        return enumC61188Rgo2;
                    }
                }
                EnumC61188Rgo enumC61188Rgo3 = EnumC61188Rgo.A08;
                if (A1E.contains(enumC61188Rgo3)) {
                    Pattern pattern2 = A03;
                    C14360o3.A08(pattern2);
                    if (AbstractC31175DnJ.A1Z(A0s, pattern2)) {
                        return enumC61188Rgo3;
                    }
                }
                EnumC61188Rgo enumC61188Rgo4 = EnumC61188Rgo.A05;
                if (A1E.contains(enumC61188Rgo4)) {
                    Pattern pattern3 = A00;
                    C14360o3.A08(pattern3);
                    if (AbstractC31175DnJ.A1Z(A0s, pattern3)) {
                        return enumC61188Rgo4;
                    }
                }
                EnumC61188Rgo enumC61188Rgo5 = EnumC61188Rgo.A07;
                if (A1E.contains(enumC61188Rgo5)) {
                    Pattern pattern4 = A02;
                    C14360o3.A08(pattern4);
                    if (AbstractC31175DnJ.A1Z(A0s, pattern4)) {
                        return enumC61188Rgo5;
                    }
                }
                EnumC61188Rgo enumC61188Rgo6 = EnumC61188Rgo.A06;
                if (A1E.contains(enumC61188Rgo6)) {
                    Pattern pattern5 = A01;
                    C14360o3.A08(pattern5);
                    if (AbstractC31175DnJ.A1Z(A0s, pattern5)) {
                        return enumC61188Rgo6;
                    }
                }
                EnumC61188Rgo enumC61188Rgo7 = EnumC61188Rgo.A09;
                if (A1E.contains(enumC61188Rgo7)) {
                    Pattern pattern6 = A04;
                    C14360o3.A08(pattern6);
                    if (AbstractC31175DnJ.A1Z(A0s, pattern6)) {
                        return enumC61188Rgo7;
                    }
                }
            }
        }
        return EnumC61188Rgo.A0A;
    }

    static {
        String A0g = AnonymousClass001.A0g("3|", EnumC61188Rgo.A05.A02.pattern(), "[\\d]*");
        String A0g2 = AnonymousClass001.A0g("6|60|601|64|62|622|622[19]|62212|62292|65|652|6521|653|6531|", EnumC61188Rgo.A06.A02.pattern(), "[\\d]*");
        String A0g3 = AnonymousClass001.A0g("3|35|352|", EnumC61188Rgo.A07.A02.pattern(), "[\\d]*");
        String A0g4 = AnonymousClass001.A0g("5|2|2[2-7]|22[2-9]|27[0-2]|", EnumC61188Rgo.A08.A02.pattern(), "[\\d]*");
        String A0g5 = AnonymousClass001.A0g("5|50|508|6|65|652|6521|653|6530|6531|60|", EnumC61188Rgo.A09.A02.pattern(), "[\\d]*");
        String A0R = AnonymousClass001.A0R(EnumC61188Rgo.A0B.A02.pattern(), "[\\d]*");
        A00 = Pattern.compile(A0g);
        A01 = Pattern.compile(A0g2);
        A02 = Pattern.compile(A0g3);
        A03 = Pattern.compile(A0g4);
        A04 = Pattern.compile(A0g5);
        A05 = Pattern.compile(A0R);
    }
}
