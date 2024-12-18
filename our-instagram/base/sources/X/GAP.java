package X;

import com.facebook.R;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public final class GAP implements InterfaceC37258GbB {
    public final Integer A00;
    public final List A01;
    public final Map A02;

    public GAP(Integer num) {
        this.A00 = num;
        EnumC54222eY enumC54222eY = EnumC54222eY.A0I;
        C09530e4 A0o = AbstractC167007dF.A0o(enumC54222eY, R.plurals.chat_badge);
        EnumC54222eY enumC54222eY2 = EnumC54222eY.A0G;
        C09530e4 A0o2 = AbstractC167007dF.A0o(enumC54222eY2, R.plurals.comment_badge);
        EnumC54222eY enumC54222eY3 = EnumC54222eY.A0f;
        C09530e4 A0o3 = AbstractC167007dF.A0o(enumC54222eY3, R.plurals.follow_badge);
        EnumC54222eY enumC54222eY4 = EnumC54222eY.A0T;
        C09530e4 A0o4 = AbstractC167007dF.A0o(enumC54222eY4, R.plurals.like_badge);
        EnumC54222eY enumC54222eY5 = EnumC54222eY.A0X;
        this.A02 = AbstractC06930Yk.A06(A0o, A0o2, A0o3, A0o4, AbstractC167007dF.A0o(enumC54222eY5, R.plurals.new_post_badge));
        this.A01 = AbstractC16960so.A1Q(enumC54222eY, enumC54222eY2, enumC54222eY3, enumC54222eY4, enumC54222eY5);
    }
}
