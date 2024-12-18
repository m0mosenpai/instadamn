package X;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.facebook.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.common.util.gradient.BackgroundGradientColors;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* renamed from: X.8Ia, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C184858Ia implements InterfaceC1810781j {
    public Drawable A00;
    public Drawable A01;
    public C188608Wz A02;
    public C198308pf A03;
    public final float A04;
    public final float A05;
    public final Activity A06;
    public final UserSession A07;
    public final C1810981l A08;
    public final C183688Ct A09;
    public final TargetViewSizeProvider A0A;
    public final C184868Ib A0B;
    public final InterfaceC1810081c A0C;
    public final C70843Fw A0D;
    public final C89F A0E;
    public final InteractiveDrawableContainer A0F;

    /* JADX WARN: Type inference failed for: r0v5, types: [X.8Ib] */
    public C184858Ia(C1810981l c1810981l, C89F c89f, C183688Ct c183688Ct, TargetViewSizeProvider targetViewSizeProvider, C81J c81j, InterfaceC1810081c interfaceC1810081c, InteractiveDrawableContainer interactiveDrawableContainer) {
        C14360o3.A0B(interactiveDrawableContainer, 4);
        C14360o3.A0B(c1810981l, 5);
        C14360o3.A0B(targetViewSizeProvider, 7);
        this.A09 = c183688Ct;
        this.A0E = c89f;
        this.A0F = interactiveDrawableContainer;
        this.A08 = c1810981l;
        this.A0C = interfaceC1810081c;
        this.A0A = targetViewSizeProvider;
        UserSession userSession = c81j.A0S;
        this.A07 = userSession;
        Activity activity = c81j.A05;
        this.A06 = activity;
        C14360o3.A07(userSession);
        this.A0D = AbstractC70833Fv.A00(userSession);
        this.A0B = new C8HF() { // from class: X.8Ib
            @Override // X.C8HF
            public final void Dq8(C183978Ee c183978Ee) {
                C14360o3.A0B(c183978Ee, 0);
                c183978Ee.A17 = true;
                C188608Wz c188608Wz = C184858Ia.this.A02;
                if (c188608Wz != null) {
                    c188608Wz.A00.A00(new C198308pf(c183978Ee));
                }
            }

            @Override // X.C8HF
            public final void onFailure(Exception exc) {
            }
        };
        C14360o3.A07(activity);
        float A00 = AbstractC13880nE.A00(activity, 296.0f);
        this.A05 = A00;
        this.A04 = A00 / 2.0f;
    }

    private final C8FC A00(boolean z) {
        C23108AGw c23108AGw = new C23108AGw();
        c23108AGw.A0Q = false;
        c23108AGw.A05 = z ? 1 : 0;
        c23108AGw.A0I = false;
        c23108AGw.A04 = 0.7f;
        c23108AGw.A00 = 1.5f;
        c23108AGw.A01 = 0.25f;
        c23108AGw.A0P = true;
        c23108AGw.A0N = true;
        int i = (int) (this.A05 * 0.7f);
        c23108AGw.A06 = new C221619qQ(new Rect(0, 0, i, i));
        c23108AGw.A01(0.0f, this.A06.getResources().getDimension(R.dimen.abc_dialog_padding_top_material));
        if (z) {
            c23108AGw.A08 = this.A0E;
        }
        return new C8FC(c23108AGw);
    }

    private final void A01(C198308pf c198308pf) {
        if (c198308pf.A05.ordinal() != 0) {
            C195868lW c195868lW = c198308pf.A03;
            if (c195868lW != null) {
                try {
                    UserSession userSession = this.A07;
                    C14360o3.A06(userSession);
                    Medium A03 = C8IU.A03(new File(c195868lW.A0k), 3, 0);
                    EnumC222999se enumC222999se = EnumC222999se.A0A;
                    int i = (int) this.A05;
                    float f = this.A04;
                    C210399Se c210399Se = new C210399Se(new C206169Az(1, f, f, f, f), A03, userSession, enumC222999se, EnumC222939sY.A06, "rollcall_v2_video_sticker", 0.0f, i, i, -1, Integer.MIN_VALUE, false);
                    C183688Ct c183688Ct = this.A09;
                    ArrayList A1N = AbstractC16960so.A1N("rollcall_v2_video_sticker");
                    c183688Ct.A0h(c210399Se, C5GJ.ASSET_PICKER, A00(true), "rollcall_v2_video_sticker", A1N);
                    this.A00 = c210399Se;
                    return;
                } catch (IllegalArgumentException e) {
                    AbstractC12120kG.A0E("RollCallCaptureController", "Error creating video sticker for video Roll Call.", e);
                    return;
                }
            }
            return;
        }
        C183978Ee c183978Ee = c198308pf.A02;
        if (c183978Ee != null) {
            String A06 = c183978Ee.A06();
            int i2 = (int) this.A05;
            Bitmap A0G = C1NC.A0G(A06, i2, i2, i2, i2, c183978Ee.A07, c183978Ee.A14);
            if (A0G != null) {
                Activity activity = this.A06;
                C14360o3.A06(activity);
                File file = new File(c183978Ee.A06());
                C14360o3.A0B(file, 0);
                C202728xq c202728xq = new C202728xq(activity, A0G, C8IU.A03(file, 1, 0), null, C8OK.A0B, null, i2, i2, true, false, false, false);
                C183688Ct c183688Ct2 = this.A09;
                ArrayList A1N2 = AbstractC16960so.A1N("rollcall_v2_photo_sticker");
                c183688Ct2.A0h(c202728xq, C5GJ.ASSET_PICKER, A00(false), "rollcall_v2_photo_sticker", A1N2);
                this.A00 = c202728xq;
            }
        }
    }

    public static final void A02(C198308pf c198308pf, C184858Ia c184858Ia) {
        C195868lW c195868lW;
        Integer num;
        InterfaceC1810081c interfaceC1810081c = c184858Ia.A0C;
        if (interfaceC1810081c.CRB(EnumC1810181d.A18)) {
            C198308pf c198308pf2 = c184858Ia.A03;
            if (c198308pf2 != null) {
                EnumC198268pb enumC198268pb = c198308pf2.A05;
                if (enumC198268pb == EnumC198268pb.A04) {
                    C183978Ee c183978Ee = c198308pf2.A02;
                    if (c183978Ee != null) {
                        c183978Ee.A17 = true;
                    }
                } else if (enumC198268pb == EnumC198268pb.A07 && (c195868lW = c198308pf2.A03) != null) {
                    c195868lW.A1E = true;
                }
                C188608Wz c188608Wz = c184858Ia.A02;
                if (c188608Wz != null) {
                    c188608Wz.A00.A00(c198308pf2);
                }
                c184858Ia.A01(c198308pf);
                C70843Fw c70843Fw = c184858Ia.A0D;
                Long l = c70843Fw.A00;
                if (l != null) {
                    if (((Number) c70843Fw.A05.invoke()).longValue() > l.longValue()) {
                        num = C05F.A0N;
                        Activity activity = c184858Ia.A06;
                        C14360o3.A06(activity);
                        C14360o3.A06(c184858Ia.A07);
                        C202528xW c202528xW = new C202528xW(activity, num, ((NineSixteenLayoutConfigImpl) c184858Ia.A0A).A0K.getWidth(), new Date().getTime());
                        c184858Ia.A09.A0h(c202528xW, C5GJ.ASSET_PICKER, new C8FC((C8D0) null, (C8FD) null, (C89G) null, C05F.A00, (Integer) null, (Integer) null, (Object) null, (String) null, (List) null, -1.0f, -1.0f, -1.0f, -1.0f, -1.0f, 10, false, false, true, false, true, false, false, true, true, true, true, false, false, false), "rollcall_v2_timestamp_sticker", AbstractC16960so.A1N("rollcall_v2_timestamp_sticker"));
                        c184858Ia.A01 = c202528xW;
                        return;
                    }
                }
                num = C05F.A0C;
                Activity activity2 = c184858Ia.A06;
                C14360o3.A06(activity2);
                C14360o3.A06(c184858Ia.A07);
                C202528xW c202528xW2 = new C202528xW(activity2, num, ((NineSixteenLayoutConfigImpl) c184858Ia.A0A).A0K.getWidth(), new Date().getTime());
                c184858Ia.A09.A0h(c202528xW2, C5GJ.ASSET_PICKER, new C8FC((C8D0) null, (C8FD) null, (C89G) null, C05F.A00, (Integer) null, (Integer) null, (Object) null, (String) null, (List) null, -1.0f, -1.0f, -1.0f, -1.0f, -1.0f, 10, false, false, true, false, true, false, false, true, true, true, true, false, false, false), "rollcall_v2_timestamp_sticker", AbstractC16960so.A1N("rollcall_v2_timestamp_sticker"));
                c184858Ia.A01 = c202528xW2;
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        c184858Ia.A03 = c198308pf;
        interfaceC1810081c.E4u(new Object());
    }

    @Override // X.InterfaceC1810781j
    public final /* bridge */ /* synthetic */ void DoV(Object obj, Object obj2, Object obj3) {
        C183978Ee c183978Ee;
        Bitmap bitmap;
        BackgroundGradientColors A00;
        if (obj3 instanceof C8WW) {
            C198308pf c198308pf = this.A03;
            if (c198308pf != null) {
                A01(c198308pf);
                File file = null;
                if (c198308pf.A05.ordinal() != 0) {
                    C195868lW c195868lW = c198308pf.A03;
                    if (c195868lW != null) {
                        file = new File(c195868lW.A0k);
                    }
                    A00 = AbstractC22750A1u.A00(this.A07, file, true);
                } else {
                    C183978Ee c183978Ee2 = c198308pf.A02;
                    if (c183978Ee2 != null) {
                        file = c183978Ee2.A03();
                    }
                    A00 = AbstractC22750A1u.A00(this.A07, file, false);
                }
                Activity activity = this.A06;
                C14360o3.A06(activity);
                AbstractC70197WGf.A06(activity, new C23680AeF(this), C50472Tr.A01(), 0.2f, A00.A01, A00.A00, false);
                return;
            }
            return;
        }
        if (!(obj3 instanceof C187588Tb) || obj != EnumC1810181d.A18) {
            return;
        }
        C198308pf c198308pf2 = this.A03;
        if (c198308pf2 != null && (c183978Ee = c198308pf2.A02) != null && (bitmap = c183978Ee.A0C) != null) {
            bitmap.recycle();
        }
        this.A03 = null;
    }
}
