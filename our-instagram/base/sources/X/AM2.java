package X;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.GradientDrawable;
import android.view.TextureView;
import android.view.View;
import android.view.ViewStub;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.util.gradient.BackgroundGradientColors;
import com.instagram.ui.text.TextColorScheme;
import com.instagram.ui.text.TextColors;
import com.instagram.ui.text.TextShadow;
import com.instagram.ui.widget.colourwheel.ColourWheelView;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class AM2 {
    public int A00;
    public C8DV A01;
    public AQ3 A02;
    public C190888ck A03;
    public boolean A04;
    public boolean A05 = true;
    public final Context A06;
    public final View A07;
    public final C55982hj A08;
    public final UserSession A09;
    public final InterfaceC56392iX A0A;
    public final C184698Hk A0B;
    public final C22837A5g A0C;
    public final C81L A0D;
    public final C23031Ai A0E;
    public final ColourWheelView A0F;

    public static void A01(AM2 am2, boolean z) {
        InterfaceC56392iX interfaceC56392iX;
        String str;
        C8DV c8dv = am2.A01;
        if (c8dv == null) {
            AbstractC12120kG.A01("TextModeComposerGradientBackgroundController", "mTextColorSchemeList is null while trying to move to next background");
            return;
        }
        c8dv.A00();
        if (z) {
            C23031Ai c23031Ai = am2.A0E;
            String str2 = am2.A03.A09;
            int i = am2.A01.A00;
            C14360o3.A0B(str2, 0);
            InterfaceC19610xo A0w = AbstractC166987dD.A0w(c23031Ai);
            A0w.E7D(AnonymousClass001.A0R("text_to_camera_gradient_background_index_", str2), i);
            A0w.apply();
        }
        TextColorScheme A03 = am2.A03();
        if (A03.A05 != null) {
            AQ3 aq3 = am2.A02;
            if (aq3 == null) {
                aq3 = new AQ3(am2.A06, am2.A09);
                am2.A02 = aq3;
            }
            interfaceC56392iX = am2.A0A;
            TextureView textureView = (TextureView) interfaceC56392iX.getView();
            Integer num = A03.A05;
            boolean A1R = AbstractC167007dF.A1R(0, textureView, num);
            InterfaceC09390do interfaceC09390do = aq3.A05;
            C25005B4e c25005B4e = (C25005B4e) interfaceC09390do.getValue();
            int intValue = num.intValue();
            if (intValue != 0) {
                if (intValue != A1R) {
                    if (intValue != 2) {
                        if (intValue != 3) {
                            if (intValue == 4) {
                                str = "iglu/filters/multi_color_gradient_v2/gradient_rainbow.png";
                            } else {
                                throw B4Z.A00();
                            }
                        } else {
                            str = "iglu/filters/multi_color_gradient_v2/gradient_blue.png";
                        }
                    } else {
                        str = "iglu/filters/multi_color_gradient_v2/gradient_purple.png";
                    }
                } else {
                    str = "iglu/filters/multi_color_gradient_v2/gradient_pink.png";
                }
            } else {
                str = "iglu/filters/multi_color_gradient_v2/gradient_orange.png";
            }
            synchronized (c25005B4e) {
                c25005B4e.A01 = str;
            }
            if (textureView.getSurfaceTextureListener() == null) {
                textureView.setSurfaceTextureListener(aq3);
                if (textureView.isAvailable() && textureView.getSurfaceTexture() != null) {
                    C25005B4e c25005B4e2 = (C25005B4e) interfaceC09390do.getValue();
                    SurfaceTexture surfaceTexture = textureView.getSurfaceTexture();
                    if (surfaceTexture != null) {
                        synchronized (c25005B4e2) {
                            c25005B4e2.A00 = surfaceTexture;
                        }
                        c25005B4e2.A03 = A1R;
                        c25005B4e2.start();
                    } else {
                        throw AbstractC166997dE.A0g();
                    }
                }
            }
            ((C25005B4e) interfaceC09390do.getValue()).A02 = A1R;
            if (am2.A03().A05 != null) {
                interfaceC56392iX.setVisibility(0);
            }
        } else {
            GradientDrawable.Orientation orientation = A03.A03;
            orientation.getClass();
            GradientDrawable gradientDrawable = new GradientDrawable(orientation, A03.A01());
            gradientDrawable.setDither(true);
            View view = am2.A07;
            RectF rectF = AbstractC13880nE.A01;
            view.setBackground(gradientDrawable);
            view.setVisibility(0);
            interfaceC56392iX = am2.A0A;
            interfaceC56392iX.setVisibility(8);
        }
        C184698Hk c184698Hk = am2.A0B;
        GradientDrawable.Orientation orientation2 = A03.A03;
        orientation2.getClass();
        c184698Hk.A02(orientation2, A03.A01(), 0);
        C8LD c8ld = am2.A0C.A00;
        c8ld.A0E = A03;
        C8LD.A0A(c8ld);
        C8LD.A0D(c8ld);
        Iterator it = c8ld.A0C.A09.A0R(new C64286T7v(2)).iterator();
        if (it.hasNext()) {
            it.next();
            throw AbstractC166987dD.A15("onBackgroundUpdated");
        }
        View view2 = am2.A07;
        if (view2.getVisibility() != 0 && interfaceC56392iX.CGb() != 0) {
            return;
        }
        if (am2.A0D.A04) {
            am2.A08.A01();
        }
        view2.setAlpha(1.0f);
        if (!interfaceC56392iX.CWW()) {
            return;
        }
        interfaceC56392iX.getView().setAlpha(1.0f);
    }

    public static void A02(AM2 am2, boolean z) {
        if (!z) {
            am2.A07.setVisibility(0);
            if (am2.A03().A05 != null) {
                am2.A0A.setVisibility(0);
            }
            am2.A08.A08(1.0d, true);
        }
        am2.A08.A06(1.0d);
    }

    public final TextColorScheme A03() {
        String str;
        C8DV c8dv = this.A01;
        if (c8dv == null) {
            str = "mTextColorSchemeList is null";
        } else {
            TextColorScheme textColorScheme = c8dv.A02;
            if (textColorScheme != null) {
                return textColorScheme;
            }
            str = "mTextColorSchemeList.getCurrentTextColorScheme() is null";
        }
        AbstractC12120kG.A01("TextModeComposerGradientBackgroundController", str);
        return TextColorScheme.A08;
    }

    public final void A04(BackgroundGradientColors backgroundGradientColors, C190888ck c190888ck) {
        int i;
        C8LG c8lg;
        ArrayList A01;
        int i2;
        Object obj;
        this.A03 = c190888ck;
        C23031Ai c23031Ai = this.A0E;
        String str = c190888ck.A09;
        C14360o3.A0B(str, 0);
        InterfaceC19630xq interfaceC19630xq = c23031Ai.A01;
        int i3 = interfaceC19630xq.getInt(AnonymousClass001.A0R("text_to_camera_custom_text_color_scheme_index_", str), -1);
        this.A00 = interfaceC19630xq.getInt(AnonymousClass001.A0R("text_to_camera_custom_text_color_scheme_colour_", str), 0);
        Boolean bool = C198278pc.A0A.A00().A04;
        boolean z = this.A05;
        if (bool == null) {
            Context context = this.A06;
            if (z) {
                A01 = C81M.A02(context);
            } else {
                A01 = C81M.A01(context);
            }
            int i4 = 1;
            if (i3 == -1) {
                i4 = 0;
            }
            int size = A01.size() + i4;
            i2 = interfaceC19630xq.getInt(AnonymousClass001.A0R("text_to_camera_gradient_background_index_", str), 0) % size;
            if (this.A0D.A02) {
                i2 = size - 1;
            }
        } else {
            Context context2 = this.A06;
            TextColorScheme[] textColorSchemeArr = new TextColorScheme[7];
            C8LG c8lg2 = new C8LG();
            c8lg2.A02 = AbstractC167007dF.A08(context2);
            if (z) {
                int A09 = AbstractC167007dF.A09(context2, R.attr.igds_color_creation_tools_yellow);
                i = R.attr.igds_color_creation_tools_pink;
                C8LG.A01(context2, c8lg2, AbstractC53242c7.A0H(context2, R.attr.igds_color_creation_tools_pink), A09);
                c8lg2.A05 = C05F.A00;
                C8LG A00 = A00(context2, c8lg2, textColorSchemeArr, R.attr.igds_color_creation_tools_blue, 0);
                C8LG.A01(context2, A00, AbstractC53242c7.A0H(context2, R.attr.igds_color_creation_tools_purple), AbstractC167007dF.A09(context2, R.attr.igds_color_creation_tools_pink));
                A00.A05 = C05F.A01;
                C8LG A002 = A00(context2, A00, textColorSchemeArr, R.attr.igds_color_creation_tools_yellow, 1);
                C8LG.A01(context2, A002, AbstractC53242c7.A0H(context2, R.attr.igds_color_creation_tools_purple), AbstractC167007dF.A09(context2, R.attr.igds_color_creation_tools_blue));
                A002.A05 = C05F.A0C;
                C8LG A003 = A00(context2, A002, textColorSchemeArr, R.attr.igds_color_creation_tools_yellow, 2);
                C8LG.A01(context2, A003, AbstractC53242c7.A0H(context2, R.attr.igds_color_creation_tools_blue), AbstractC167007dF.A09(context2, R.attr.igds_color_creation_tools_green));
                A003.A05 = C05F.A0N;
                A003.A01 = AbstractC167007dF.A09(context2, R.attr.igds_color_creation_tools_pink);
                textColorSchemeArr[3] = new TextColorScheme(A003);
                c8lg = new C8LG();
                c8lg.A02 = AbstractC167007dF.A08(context2);
                c8lg.A02(C50R.A01);
                c8lg.A05 = C05F.A0Y;
            } else {
                int A092 = AbstractC167007dF.A09(context2, R.attr.igds_color_creation_tools_yellow);
                i = R.attr.igds_color_creation_tools_pink;
                C8LG.A01(context2, c8lg2, AbstractC53242c7.A0H(context2, R.attr.igds_color_creation_tools_pink), A092);
                C8LG A004 = A00(context2, c8lg2, textColorSchemeArr, R.attr.igds_color_creation_tools_blue, 0);
                C8LG.A01(context2, A004, AbstractC53242c7.A0H(context2, R.attr.igds_color_creation_tools_purple), AbstractC167007dF.A09(context2, R.attr.igds_color_creation_tools_pink));
                C8LG A005 = A00(context2, A004, textColorSchemeArr, R.attr.igds_color_creation_tools_yellow, 1);
                C8LG.A01(context2, A005, AbstractC53242c7.A0H(context2, R.attr.igds_color_creation_tools_purple), AbstractC167007dF.A09(context2, R.attr.igds_color_creation_tools_blue));
                C8LG A006 = A00(context2, A005, textColorSchemeArr, R.attr.igds_color_creation_tools_yellow, 2);
                C8LG.A01(context2, A006, AbstractC53242c7.A0H(context2, R.attr.igds_color_creation_tools_blue), AbstractC167007dF.A09(context2, R.attr.igds_color_creation_tools_green));
                A006.A01 = AbstractC167007dF.A09(context2, R.attr.igds_color_creation_tools_pink);
                textColorSchemeArr[3] = new TextColorScheme(A006);
                c8lg = new C8LG();
                c8lg.A02 = AbstractC167007dF.A08(context2);
                c8lg.A02(C50R.A01);
            }
            c8lg.A01 = AbstractC167007dF.A09(context2, i);
            textColorSchemeArr[4] = new TextColorScheme(c8lg);
            C8LG c8lg3 = new C8LG();
            c8lg3.A02 = AbstractC167007dF.A09(context2, R.attr.igds_color_creation_tools_grey_09);
            c8lg3.A04 = new TextColors(TextShadow.A03, context2.getColor(R.color.grey_9_50_transparent));
            C8LG.A01(context2, c8lg3, R.color.barcelona_story_share_light_mode, context2.getColor(R.color.barcelona_story_share_light_mode));
            c8lg3.A01 = AbstractC167007dF.A09(context2, R.attr.igds_color_creation_tools_red);
            textColorSchemeArr[5] = new TextColorScheme(c8lg3);
            C8LG c8lg4 = new C8LG();
            c8lg4.A02 = AbstractC167007dF.A09(context2, R.attr.igds_color_primary_text_on_media);
            C8LG.A01(context2, c8lg4, R.color.barcelona_story_share_dark_mode, context2.getColor(R.color.barcelona_story_share_dark_mode));
            c8lg4.A01 = AbstractC167007dF.A09(context2, R.attr.igds_color_creation_tools_red);
            textColorSchemeArr[6] = new TextColorScheme(c8lg4);
            A01 = AbstractC92144Au.A01(textColorSchemeArr);
            int i5 = 1;
            if (i3 == -1) {
                i5 = 0;
            }
            int size2 = A01.size() + i5;
            i2 = size2 - 2;
            if (bool.booleanValue()) {
                i2 = size2 - 1;
            }
        }
        if (backgroundGradientColors != null) {
            ArrayList arrayList = new ArrayList(A01.size());
            for (int i6 = 0; i6 < A01.size(); i6++) {
                if (((TextColorScheme) A01.get(i6)).A01().length > 2) {
                    obj = new TextColorScheme(new C8LG()).A00(backgroundGradientColors.A01, backgroundGradientColors.A00);
                } else {
                    obj = A01.get(i6);
                }
                arrayList.add(obj);
            }
            A01 = arrayList;
        }
        this.A01 = new C8DV(A01, new int[]{this.A00}, i2, i3);
        A01(this, true);
    }

    public AM2(Context context, View view, ViewStub viewStub, UserSession userSession, C184698Hk c184698Hk, C22837A5g c22837A5g, C81L c81l, ColourWheelView colourWheelView) {
        this.A06 = context;
        this.A09 = userSession;
        this.A0C = c22837A5g;
        this.A0D = c81l;
        this.A0E = AbstractC23021Ah.A00(userSession);
        this.A0B = c184698Hk;
        this.A07 = view;
        this.A0A = AbstractC56372iV.A01(viewStub, false, false);
        C55982hj A0R = AbstractC167007dF.A0R();
        A0R.A06 = true;
        A0R.A0A(new C214039e2(this, 2));
        this.A08 = A0R;
        C184708Hl Csh = c184698Hk.Csh();
        Csh.A00 = new C23741AfE(this, 3);
        this.A0F = colourWheelView;
        if (colourWheelView != null) {
            float f = c184698Hk.A00;
            colourWheelView.setColourWheelStrokeWidth(f);
            Csh.A01 = new C23742AfF(this, colourWheelView);
            colourWheelView.A0N.add(new C24141AnQ(this, colourWheelView));
            colourWheelView.A01 = (c184698Hk.A01 / 2.0f) - f;
        }
        Csh.A00();
        A04(null, AbstractC190898cl.A01("classic_v2", null, false));
    }

    public static C8LG A00(Context context, C8LG c8lg, Object[] objArr, int i, int i2) {
        c8lg.A01 = context.getColor(AbstractC53242c7.A0H(context, i));
        objArr[i2] = new TextColorScheme(c8lg);
        C8LG c8lg2 = new C8LG();
        c8lg2.A02 = context.getColor(AbstractC53242c7.A0A(context));
        return c8lg2;
    }
}
