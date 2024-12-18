package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;

/* renamed from: X.8ZD, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8ZD implements C82M {
    public C189478aR A00;
    public C189448aO A01;
    public final C87T A02;
    public final C8ZC A03;
    public final int A04;
    public final UserSession A05;
    public final C87Q A06;

    public final void A05(AnonymousClass859 anonymousClass859) {
        C14360o3.A0B(anonymousClass859, 0);
        this.A02.A08(anonymousClass859.A00.name());
    }

    @Override // X.C82M
    public final /* synthetic */ void A7T(Parcelable parcelable) {
    }

    public final KDU A02(AnonymousClass859 anonymousClass859, String str, int i, boolean z, boolean z2, boolean z3) {
        KDU kdu = new KDU();
        Bundle bundle = new Bundle();
        bundle.putInt(AbstractC43591JPw.A00(950), i);
        bundle.putString("surface", anonymousClass859.toString());
        kdu.setArguments(bundle);
        C87T c87t = this.A02;
        C87Q c87q = this.A06;
        c87t.A03 = anonymousClass859;
        c87t.A00 = new A82(AbstractC225599xe.A00(anonymousClass859), c87t.A0E, c87q);
        c87t.A0A = z;
        c87t.A09 = z3;
        c87t.A0K.set(z2);
        if (i == 15) {
            if (str == null) {
                c87t.A04.A01(C85B.A0B);
            } else {
                C87T.A02(c87t, str);
                return kdu;
            }
        }
        return kdu;
    }

    public final void A03() {
        C189478aR c189478aR = this.A00;
        if (c189478aR != null) {
            c189478aR.A0L(null);
        }
    }

    public final void A04(Context context, AnonymousClass859 anonymousClass859, float f, float f2, int i, boolean z, boolean z2, boolean z3) {
        Object obj;
        int i2;
        C189478aR c189478aR;
        BottomSheetFragment bottomSheetFragment;
        TextView A0L;
        CharSequence text;
        float f3 = f2;
        float f4 = f;
        CameraAREffect cameraAREffect = null;
        C14360o3.A0B(anonymousClass859, 2);
        if (AbstractC56862jK.A00(context)) {
            f4 = 1.0f;
            if (i == 15) {
                f4 = 0.7f;
            }
            f3 = Math.max(1.0f, 1.0f);
        }
        if (this.A00 == null) {
            C87T c87t = this.A02;
            C1810281e c1810281e = c87t.A05;
            if (c1810281e != null) {
                obj = c1810281e.A00.first;
            } else {
                obj = null;
            }
            EnumC1810181d enumC1810181d = EnumC1810181d.A09;
            boolean z4 = false;
            if (obj == enumC1810181d) {
                z4 = true;
            }
            KDU A02 = A02(anonymousClass859, null, i, z, z2, z4);
            C189448aO c189448aO = new C189448aO(this.A05);
            c189448aO.A0k = false;
            c189448aO.A0q = true;
            c189448aO.A03 = f4;
            c189448aO.A0x = true;
            c189448aO.A03 = f4;
            c189448aO.A04 = f3;
            c189448aO.A0a = true;
            C189478aR c189478aR2 = null;
            c189448aO.A0T = A02;
            c189448aO.A0U = new C24099Amk(this);
            c189448aO.A1O = false;
            if (z3) {
                i2 = context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_creation_button));
            } else {
                i2 = this.A04;
            }
            c189448aO.A06 = i2;
            this.A01 = c189448aO;
            C1810281e c1810281e2 = c87t.A05;
            if (c1810281e2 != null && c1810281e2.A00.first == enumC1810181d) {
                try {
                    c189448aO.A0P = new A7S(context.getColor(R.color.barcelona_story_share_light_mode), context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_creation_tools_grey_04)));
                    C189448aO c189448aO2 = this.A01;
                    if (c189448aO2 != null) {
                        c189448aO2.A0E = context.getColor(R.color.barcelona_story_share_light_mode);
                    }
                    if (this.A03 != null) {
                        cameraAREffect = (CameraAREffect) AbstractC191638eL.A03.getValue();
                    }
                    C189448aO c189448aO3 = this.A01;
                    if (c189448aO3 != null) {
                        if (cameraAREffect == null || (text = cameraAREffect.A0S) == null) {
                            text = context.getResources().getText(2131955896);
                        }
                        c189448aO3.A0d = text;
                    }
                    if (cameraAREffect != null) {
                        C189448aO c189448aO4 = this.A01;
                        if (c189448aO4 != null) {
                            c189448aO4.A0c = context.getString(2131953236, cameraAREffect.A0C);
                        }
                        C189448aO c189448aO5 = this.A01;
                        if (c189448aO5 != null) {
                            c189448aO5.A0Q = A00(context, this);
                        }
                        C189448aO c189448aO6 = this.A01;
                        if (c189448aO6 != null) {
                            c189448aO6.A0R = A01(context, this);
                        }
                    }
                    C189448aO c189448aO7 = this.A01;
                    if (c189448aO7 != null) {
                        c189478aR2 = c189448aO7.A00();
                    }
                    this.A00 = c189478aR2;
                    if (c189478aR2 != null) {
                        c189478aR2.A03(context, A02);
                    }
                    C189478aR c189478aR3 = this.A00;
                    if (c189478aR3 != null) {
                        c189478aR3.A09((int) AbstractC13880nE.A00(context, 64.0f));
                    }
                    int dimension = (int) context.getResources().getDimension(R.dimen.account_group_management_clickable_width);
                    C189478aR c189478aR4 = this.A00;
                    if (c189478aR4 != null && c189478aR4.A0S() && (A0L = (bottomSheetFragment = c189478aR4.A03).A0L()) != null) {
                        float textSize = A0L.getTextSize() / 2.0f;
                        float textSize2 = A0L.getTextSize();
                        InterfaceC56392iX interfaceC56392iX = bottomSheetFragment.titleTextView;
                        if (bottomSheetFragment.isAdded() && interfaceC56392iX != null && interfaceC56392iX.getView() != null) {
                            ((TextView) interfaceC56392iX.getView()).setMaxLines(1);
                            ((TextView) interfaceC56392iX.getView()).setAutoSizeTextTypeUniformWithConfiguration((int) textSize, (int) textSize2, 1, 0);
                        }
                        InterfaceC56392iX interfaceC56392iX2 = bottomSheetFragment.titleTextView;
                        if (bottomSheetFragment.isAdded() && interfaceC56392iX2 != null && interfaceC56392iX2.getView() != null) {
                            ViewGroup.LayoutParams layoutParams = interfaceC56392iX2.getView().getLayoutParams();
                            layoutParams.height = dimension;
                            interfaceC56392iX2.getView().setLayoutParams(layoutParams);
                        }
                    }
                    if (cameraAREffect != null && (c189478aR = this.A00) != null) {
                        c189478aR.A04();
                        return;
                    }
                    return;
                } catch (Error e) {
                    C0w9.A06("MiniGallery", "Exception when creating BottomSheet title header", e);
                    return;
                }
            }
            C189478aR A00 = c189448aO.A00();
            this.A00 = A00;
            A00.A0D(context, A02);
        }
    }

    public final void A06(CameraAREffect cameraAREffect) {
        C87T c87t = this.A02;
        if (cameraAREffect != null) {
            AnonymousClass858 anonymousClass858 = c87t.A04;
            String str = cameraAREffect.A0K;
            C14360o3.A07(str);
            anonymousClass858.A00.Egh(new C189118Zc(C85B.A03, str, "mini_gallery", null, null, null, null, -1, false));
            return;
        }
        c87t.A04.A01(C85B.A03);
    }

    public final boolean A07() {
        C87T c87t = this.A02;
        if (c87t.A0O.getValue() == EnumC1824287h.A03 && c87t.A0L.get()) {
            return true;
        }
        return false;
    }

    @Override // X.C82M
    public final /* synthetic */ Parcelable ANh() {
        return null;
    }

    public C8ZD(C87T c87t, UserSession userSession, C87Q c87q, C8ZC c8zc, int i) {
        this.A05 = userSession;
        this.A02 = c87t;
        this.A04 = i;
        this.A06 = c87q;
        this.A03 = c8zc;
    }

    public static final C189468aQ A00(Context context, C8ZD c8zd) {
        return new C189458aP(new AQ9(c8zd), context.getResources().getText(2131955887).toString(), context.getResources().getText(2131955887).toString(), 0, 22).A00();
    }

    public static final C189468aQ A01(Context context, C8ZD c8zd) {
        return new C189458aP(new AQA(c8zd), context.getResources().getText(2131955888).toString(), context.getResources().getText(2131955888).toString(), 0, 22).A00();
    }
}
