package X;

import com.google.common.collect.ImmutableList;

/* renamed from: X.3oV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C83863oV {
    public static final ImmutableList A03;
    public static final ImmutableList A04;
    public static final ImmutableList A05;
    public static final ImmutableList A06;
    public static final ImmutableList A07;
    public static final C83863oV A08;
    public static final C83863oV A09;
    public final int A00;
    public final String A01;
    public final String A02;

    public C83863oV(String str, String str2, int i) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str2, 2);
        this.A01 = str;
        this.A02 = str2;
        this.A00 = i;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof C83863oV) && C14360o3.A0K(this.A02, ((C83863oV) obj).A02)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.A02.hashCode();
    }

    static {
        ImmutableList of = ImmutableList.of((Object) new C83863oV("laughing", "😂", 2131971261), (Object) new C83863oV("surprised", "😮", 2131971273), (Object) new C83863oV("heart_eyes", "😍", 2131971260), (Object) new C83863oV("crying", "😢", 2131971256), (Object) new C83863oV("applause", "👏", 2131971255), (Object) new C83863oV("fire", "🔥", 2131971258), (Object) new C83863oV("party", "🎉", 2131971268), (Object) new C83863oV("perfect", "💯", 2131971269));
        C14360o3.A07(of);
        A05 = of;
        ImmutableList of2 = ImmutableList.of((Object) new C83863oV("laughing", "😂", 2131971261), (Object) new C83863oV("surprised", "😮", 2131971273), (Object) new C83863oV("heart_eyes", "😍", 2131971260), (Object) new C83863oV("crying", "😢", 2131971256), (Object) new C83863oV("applause", "👏", 2131971255), (Object) new C83863oV("fire", "🔥", 2131971258), (Object) new C83863oV("eyes", "👀", 2131971257));
        C14360o3.A07(of2);
        A06 = of2;
        C83863oV c83863oV = new C83863oV("heart", "❤", 0);
        A09 = c83863oV;
        C83863oV c83863oV2 = new C83863oV("heart", "❤", 0);
        A08 = c83863oV2;
        ImmutableList of3 = ImmutableList.of((Object) c83863oV, (Object) new C83863oV("laughing", "😂", 2131971261), (Object) new C83863oV("surprised", "😮", 2131971273), (Object) new C83863oV("crying", "😢", 2131971256), (Object) new C83863oV("angry", "😡", 0), (Object) new C83863oV("thumbs-up", "👍", 0));
        C14360o3.A07(of3);
        A04 = of3;
        ImmutableList of4 = ImmutableList.of((Object) c83863oV2, (Object) new C83863oV("laughing", "😆", 2131971261), (Object) new C83863oV("surprised", "😮", 2131971273), (Object) new C83863oV("crying", "😢", 2131971256), (Object) new C83863oV("angry", "😠", 0), (Object) new C83863oV("thumbs-up", "👍", 0));
        C14360o3.A07(of4);
        A03 = of4;
        A07 = ImmutableList.of((Object) new C83863oV("skull", "💀", 2131971267), (Object) new C83863oV("pizza", "🍕", 2131971266), (Object) new C83863oV("clown", "🤡", 2131971262), (Object) new C83863oV("ghost", "👻", 2131971263), (Object) new C83863oV("melting_face", "🫠", 2131971265), (Object) new C83863oV("growing_heart", "💗", 2131971264));
    }
}
