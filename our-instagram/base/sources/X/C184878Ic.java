package X;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.8Ic, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C184878Ic {
    public Drawable A00;
    public C8X0 A01;
    public String A02;
    public final float A03;
    public final float A04;
    public final Activity A05;
    public final UserSession A06;
    public final C89F A07;
    public final C183688Ct A08;
    public final C184888Id A09;
    public final InteractiveDrawableContainer A0A;
    public final boolean A0B;

    /* JADX WARN: Type inference failed for: r0v4, types: [X.8Id] */
    public C184878Ic(C89F c89f, C183688Ct c183688Ct, C81J c81j, InteractiveDrawableContainer interactiveDrawableContainer) {
        C14360o3.A0B(interactiveDrawableContainer, 4);
        this.A08 = c183688Ct;
        this.A07 = c89f;
        this.A0A = interactiveDrawableContainer;
        this.A06 = c81j.A0S;
        Activity activity = c81j.A05;
        this.A05 = activity;
        this.A0B = "story_selfie_reply".equals(c81j.A2q);
        this.A09 = new C8HF() { // from class: X.8Id
            @Override // X.C8HF
            public final void Dq8(C183978Ee c183978Ee) {
                C14360o3.A0B(c183978Ee, 0);
                C8X0 c8x0 = C184878Ic.this.A01;
                if (c8x0 != null) {
                    c8x0.A00.A00(new C198308pf(c183978Ee));
                }
            }

            @Override // X.C8HF
            public final void onFailure(Exception exc) {
            }
        };
        C14360o3.A07(activity);
        float A00 = AbstractC13880nE.A00(activity, 280.0f);
        this.A04 = A00;
        this.A03 = A00 / 2.0f;
    }

    public static final void A00(C198308pf c198308pf, C184878Ic c184878Ic) {
        if (c198308pf.A05.ordinal() != 0) {
            C195868lW c195868lW = c198308pf.A03;
            if (c195868lW != null) {
                try {
                    UserSession userSession = c184878Ic.A06;
                    C14360o3.A06(userSession);
                    Medium A03 = C8IU.A03(new File(c195868lW.A0k), 3, 0);
                    EnumC222999se enumC222999se = EnumC222999se.A0A;
                    int i = (int) c184878Ic.A04;
                    float f = c184878Ic.A03;
                    C210399Se c210399Se = new C210399Se(new C206169Az(1, f, f, f, f), A03, userSession, enumC222999se, EnumC222939sY.A06, "rollcall_v2_video_sticker", 0.0f, i, i, -1, Integer.MIN_VALUE, false);
                    c184878Ic.A00 = c210399Se;
                    Bitmap A00 = c210399Se.A00(0L);
                    c184878Ic.A02 = null;
                    if (A00 != null) {
                        File A04 = AbstractC13530mf.A04(c184878Ic.A05);
                        C14360o3.A07(A04);
                        if (C1NC.A0M(A00, A04)) {
                            c184878Ic.A02 = A04.getCanonicalPath();
                        }
                    }
                    C8X0 c8x0 = c184878Ic.A01;
                    if (c8x0 != null) {
                        c8x0.A00.A00(new C198308pf(c195868lW));
                        return;
                    }
                    return;
                } catch (IllegalArgumentException unused) {
                    return;
                }
            }
            return;
        }
        C183978Ee c183978Ee = c198308pf.A02;
        if (c183978Ee != null) {
            String A06 = c183978Ee.A06();
            int i2 = (int) c184878Ic.A04;
            Bitmap A0G = C1NC.A0G(A06, i2, i2, i2, i2, c183978Ee.A07, c183978Ee.A14);
            if (A0G != null) {
                Activity activity = c184878Ic.A05;
                C14360o3.A06(activity);
                File file = new File(c183978Ee.A06());
                C14360o3.A0B(file, 0);
                C202728xq c202728xq = new C202728xq(activity, A0G, C8IU.A03(file, 1, 0), null, C8OK.A0B, null, i2, i2, true, false, false, false);
                C183688Ct c183688Ct = c184878Ic.A08;
                ArrayList A1N = AbstractC16960so.A1N("rollcall_v2_photo_sticker");
                c183688Ct.A0h(c202728xq, C5GJ.ASSET_PICKER, new C8FC((C8D0) null, (C8FD) null, (C89G) null, C05F.A00, (Integer) null, (Integer) null, (Object) null, (String) null, (List) null, 1.0f, 1.0f, 1.0f, -1.0f, -1.0f, 0, false, true, false, false, true, false, false, false, false, true, true, false, false, false), "rollcall_v2_photo_sticker", A1N);
                c184878Ic.A00 = c202728xq;
                c184878Ic.A02 = null;
                File A042 = AbstractC13530mf.A04(activity);
                C14360o3.A07(A042);
                if (C1NC.A0M(A0G, A042)) {
                    c184878Ic.A02 = A042.getCanonicalPath();
                }
                File file2 = new File(C50472Tr.A01(), c183978Ee.A03().getName());
                C1NC.A0M(A0G, file2);
                UserSession userSession2 = c184878Ic.A06;
                C14360o3.A06(userSession2);
                C14360o3.A0B(file2, 0);
                LBX.A00(activity, C8IU.A03(file2, 1, 0), userSession2, c184878Ic.A09);
            }
        }
    }
}
