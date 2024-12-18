package X;

import android.content.Context;
import android.text.Editable;
import android.text.Layout;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.ui.text.TextColorScheme;
import com.instagram.ui.text.TextColors;
import com.instagram.ui.text.TextShadow;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.81M, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C81M {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public Editable A04;
    public Layout.Alignment A05;
    public C88Z A06;
    public C190888ck A07;
    public C202278x7 A08;
    public String A09;
    public List A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;

    public static C81M A00(Fragment fragment, C8LG c8lg, int[] iArr) {
        c8lg.A02(iArr);
        TextColorScheme textColorScheme = new TextColorScheme(c8lg);
        ArrayList A01 = A01(fragment.requireContext());
        A01.add(0, textColorScheme);
        C81M A012 = new AGv(fragment.requireContext()).A01();
        A012.A0E = true;
        A012.A0A = A01;
        return A012;
    }

    public static ArrayList A01(Context context) {
        C8LG c8lg = new C8LG();
        c8lg.A02 = context.getColor(AbstractC53242c7.A0A(context));
        c8lg.A02(context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_creation_tools_yellow)), context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_creation_tools_pink)));
        c8lg.A01 = context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_creation_tools_blue));
        TextColorScheme textColorScheme = new TextColorScheme(c8lg);
        C8LG c8lg2 = new C8LG();
        c8lg2.A02 = context.getColor(AbstractC53242c7.A0A(context));
        c8lg2.A02(context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_creation_tools_pink)), context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_creation_tools_purple)));
        c8lg2.A01 = context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_creation_tools_yellow));
        TextColorScheme textColorScheme2 = new TextColorScheme(c8lg2);
        C8LG c8lg3 = new C8LG();
        c8lg3.A02 = context.getColor(AbstractC53242c7.A0A(context));
        c8lg3.A02(context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_creation_tools_blue)), context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_creation_tools_purple)));
        c8lg3.A01 = context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_creation_tools_yellow));
        TextColorScheme textColorScheme3 = new TextColorScheme(c8lg3);
        C8LG c8lg4 = new C8LG();
        c8lg4.A02 = context.getColor(AbstractC53242c7.A0A(context));
        c8lg4.A02(context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_creation_tools_green)), context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_creation_tools_blue)));
        c8lg4.A01 = context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_creation_tools_pink));
        TextColorScheme textColorScheme4 = new TextColorScheme(c8lg4);
        C8LG c8lg5 = new C8LG();
        c8lg5.A02 = context.getColor(AbstractC53242c7.A0A(context));
        c8lg5.A02(C50R.A01);
        c8lg5.A01 = context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_creation_tools_pink));
        TextColorScheme textColorScheme5 = new TextColorScheme(c8lg5);
        C8LG c8lg6 = new C8LG();
        c8lg6.A02 = context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_creation_tools_grey_09));
        c8lg6.A04 = new TextColors(TextShadow.A03, context.getColor(R.color.grey_9_50_transparent));
        c8lg6.A02(context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_creation_tools_grey_03)), context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_creation_tools_grey_03)));
        c8lg6.A01 = context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_creation_tools_red));
        TextColorScheme textColorScheme6 = new TextColorScheme(c8lg6);
        C8LG c8lg7 = new C8LG();
        c8lg7.A02 = context.getColor(AbstractC53242c7.A0A(context));
        c8lg7.A02(context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_creation_tools_grey_09)), context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_creation_tools_grey_09)));
        c8lg7.A01 = context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_creation_tools_red));
        return AbstractC92144Au.A01(textColorScheme, textColorScheme2, textColorScheme3, textColorScheme4, textColorScheme5, textColorScheme6, new TextColorScheme(c8lg7));
    }

    public static ArrayList A02(Context context) {
        C8LG c8lg = new C8LG();
        c8lg.A02 = context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_primary_text_on_media));
        c8lg.A02(context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_creation_tools_yellow)), context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_creation_tools_pink)));
        c8lg.A05 = C05F.A00;
        c8lg.A01 = context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_creation_tools_blue));
        TextColorScheme textColorScheme = new TextColorScheme(c8lg);
        C8LG c8lg2 = new C8LG();
        c8lg2.A02 = context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_primary_text_on_media));
        c8lg2.A02(context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_creation_tools_pink)), context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_creation_tools_purple)));
        c8lg2.A05 = C05F.A01;
        c8lg2.A01 = context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_creation_tools_yellow));
        TextColorScheme textColorScheme2 = new TextColorScheme(c8lg2);
        C8LG c8lg3 = new C8LG();
        c8lg3.A02 = context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_primary_text_on_media));
        c8lg3.A02(context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_creation_tools_blue)), context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_creation_tools_purple)));
        c8lg3.A05 = C05F.A0C;
        c8lg3.A01 = context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_creation_tools_yellow));
        TextColorScheme textColorScheme3 = new TextColorScheme(c8lg3);
        C8LG c8lg4 = new C8LG();
        c8lg4.A02 = context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_primary_text_on_media));
        c8lg4.A02(context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_creation_tools_green)), context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_creation_tools_blue)));
        c8lg4.A05 = C05F.A0N;
        c8lg4.A01 = context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_creation_tools_pink));
        TextColorScheme textColorScheme4 = new TextColorScheme(c8lg4);
        C8LG c8lg5 = new C8LG();
        c8lg5.A02 = context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_primary_text_on_media));
        c8lg5.A02(C50R.A01);
        c8lg5.A05 = C05F.A0Y;
        c8lg5.A01 = context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_creation_tools_pink));
        TextColorScheme textColorScheme5 = new TextColorScheme(c8lg5);
        C8LG c8lg6 = new C8LG();
        c8lg6.A02 = context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_creation_tools_grey_09));
        c8lg6.A04 = new TextColors(TextShadow.A03, context.getColor(R.color.grey_9_50_transparent));
        c8lg6.A02(context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_creation_tools_grey_03)), context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_creation_tools_grey_03)));
        c8lg6.A01 = context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_creation_tools_red));
        TextColorScheme textColorScheme6 = new TextColorScheme(c8lg6);
        C8LG c8lg7 = new C8LG();
        c8lg7.A02 = context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_primary_text_on_media));
        c8lg7.A02(context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_creation_tools_grey_09)), context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_creation_tools_grey_09)));
        c8lg7.A01 = context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_creation_tools_red));
        return AbstractC92144Au.A01(textColorScheme, textColorScheme2, textColorScheme3, textColorScheme4, textColorScheme5, textColorScheme6, new TextColorScheme(c8lg7));
    }

    public static ArrayList A03(Context context) {
        C8LG c8lg = new C8LG();
        c8lg.A02(context.getColor(R.color.grey_0), context.getColor(R.color.grey_0));
        TextColorScheme textColorScheme = new TextColorScheme(c8lg);
        C8LG c8lg2 = new C8LG();
        c8lg2.A02(context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_creation_tools_grey_09)), context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_creation_tools_grey_09)));
        TextColorScheme textColorScheme2 = new TextColorScheme(c8lg2);
        C8LG c8lg3 = new C8LG();
        c8lg3.A02(context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_creation_tools_yellow)), context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_creation_tools_pink)));
        TextColorScheme textColorScheme3 = new TextColorScheme(c8lg3);
        C8LG c8lg4 = new C8LG();
        c8lg4.A02(context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_creation_tools_pink)), context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_creation_tools_purple)));
        TextColorScheme textColorScheme4 = new TextColorScheme(c8lg4);
        C8LG c8lg5 = new C8LG();
        c8lg5.A02(context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_creation_tools_blue)), context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_creation_tools_purple)));
        TextColorScheme textColorScheme5 = new TextColorScheme(c8lg5);
        C8LG c8lg6 = new C8LG();
        c8lg6.A02(context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_creation_tools_green)), context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_creation_tools_blue)));
        TextColorScheme textColorScheme6 = new TextColorScheme(c8lg6);
        C8LG c8lg7 = new C8LG();
        c8lg7.A02(C50R.A01);
        return AbstractC92144Au.A01(textColorScheme, textColorScheme2, textColorScheme3, textColorScheme4, textColorScheme5, textColorScheme6, new TextColorScheme(c8lg7));
    }

    public static ArrayList A04(Context context, String str) {
        C8LG c8lg = new C8LG();
        c8lg.A06 = str;
        c8lg.A02(AbstractC53242c7.A0H(context, R.attr.igds_color_default_render), AbstractC53242c7.A0H(context, R.attr.igds_color_default_render));
        return AbstractC92144Au.A01(new TextColorScheme(c8lg));
    }

    public final C81M A05() {
        try {
            StringWriter stringWriter = new StringWriter();
            C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
            AbstractC23022ADe.A00(A0A, this);
            A0A.close();
            C81M parseFromJson = AbstractC23022ADe.parseFromJson(C16V.A00(stringWriter.toString()));
            parseFromJson.A04 = this.A04;
            parseFromJson.A07 = this.A07;
            return parseFromJson;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
