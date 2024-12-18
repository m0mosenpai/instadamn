package X;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.ar.features.effectspage.models.EffectsPageModel;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import instagram.features.clips.ar.features.effectspage.ui.EffectsPageFragment;

/* loaded from: classes9.dex */
public final class PCU implements InterfaceC57985PnV, InterfaceC195318kX {
    public int A00;
    public O52 A01;
    public C51902Mwk A02;
    public final int A03;
    public final int A04;
    public final Activity A05;
    public final View A06;
    public final ViewGroup A07;
    public final UserSession A08;
    public final OHG A09;
    public final OJ2 A0A;
    public final InterfaceC09390do A0B;
    public final InterfaceC09390do A0C;

    @Override // X.InterfaceC195318kX
    public final void D5X() {
    }

    public /* synthetic */ PCU(Activity activity, View view, UserSession userSession, OJ2 oj2) {
        OHG ohg = new OHG(userSession);
        this.A06 = view;
        this.A05 = activity;
        this.A08 = userSession;
        this.A0A = oj2;
        this.A09 = ohg;
        this.A07 = (ViewGroup) AbstractC166987dD.A0c(view, R.id.effect_footer_container);
        Resources resources = view.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.action_bar_plus_shadow_height);
        this.A03 = dimensionPixelSize;
        this.A04 = resources.getDimensionPixelSize(R.dimen.action_bar_item_spacing_right);
        this.A00 = dimensionPixelSize;
        this.A02 = new C51902Mwk(null, 0.0f, false, false);
        this.A0C = C57520Pfu.A00(this, 25);
        this.A0B = AbstractC09440dt.A01(new C57520Pfu(this, 24));
    }

    private final void A00(CameraAREffect cameraAREffect) {
        boolean z;
        String str;
        InterfaceC09390do interfaceC09390do = this.A0C;
        if (((C195328kY) interfaceC09390do.getValue()).A01 && cameraAREffect == null) {
            ((C195328kY) interfaceC09390do.getValue()).A0F();
            return;
        }
        C195328kY c195328kY = (C195328kY) interfaceC09390do.getValue();
        boolean z2 = false;
        if (cameraAREffect != null) {
            z = cameraAREffect.CcN();
        } else {
            z = false;
        }
        c195328kY.setBookmarkIconExpanded(z);
        C195328kY c195328kY2 = (C195328kY) interfaceC09390do.getValue();
        String str2 = null;
        if (cameraAREffect != null) {
            str = cameraAREffect.A0S;
            str2 = AbstractC167007dF.A0f(this.A06.getContext(), cameraAREffect.A0C, 2131953236);
        } else {
            str = null;
        }
        if (cameraAREffect != null) {
            z2 = cameraAREffect.CcN();
        }
        c195328kY2.setCurrentTitle(new C174587ps(str, str2, true, z2, ((C195328kY) interfaceC09390do.getValue()).A01, false, false));
    }

    @Override // X.InterfaceC57985PnV
    public final /* bridge */ /* synthetic */ void ADV(InterfaceC57856PlM interfaceC57856PlM) {
        int i;
        C51902Mwk c51902Mwk = (C51902Mwk) interfaceC57856PlM;
        C14360o3.A0B(c51902Mwk, 0);
        boolean z = this.A02.A03;
        boolean z2 = c51902Mwk.A03;
        if (z != z2) {
            C87T c87t = ((C8ZD) this.A0B.getValue()).A02;
            if (c87t.A0B != z2) {
                c87t.A0B = z2;
                C87T.A01(c87t);
            }
        }
        C51902Mwk c51902Mwk2 = this.A02;
        boolean z3 = c51902Mwk2.A02;
        boolean z4 = c51902Mwk.A02;
        if (z3 != z4) {
            if (z4) {
                CameraAREffect cameraAREffect = c51902Mwk.A01;
                this.A07.setVisibility(0);
                InterfaceC09390do interfaceC09390do = this.A0C;
                boolean z5 = false;
                ((C195328kY) interfaceC09390do.getValue()).setHorizontalMargin(0);
                C195328kY c195328kY = (C195328kY) interfaceC09390do.getValue();
                if (cameraAREffect != null) {
                    z5 = cameraAREffect.CcN();
                }
                c195328kY.setBookmarkIconExpanded(z5);
                ((C195328kY) interfaceC09390do.getValue()).A0E();
                A00(cameraAREffect);
                i = this.A03;
            } else {
                this.A07.setVisibility(8);
                i = this.A04;
            }
            this.A00 = i;
        } else {
            CameraAREffect cameraAREffect2 = c51902Mwk2.A01;
            CameraAREffect cameraAREffect3 = c51902Mwk.A01;
            if (!C14360o3.A0K(cameraAREffect2, cameraAREffect3)) {
                A00(cameraAREffect3);
            }
        }
        float f = c51902Mwk.A00;
        float measuredHeight = 0.7f * this.A06.getMeasuredHeight();
        float min = Math.min(f, measuredHeight);
        ViewGroup viewGroup = this.A07;
        viewGroup.setAlpha(Math.min(f / measuredHeight, 1.0f));
        viewGroup.setTranslationY(-min);
        this.A02 = c51902Mwk;
    }

    @Override // X.InterfaceC195318kX
    public final void DD0() {
        CameraAREffect cameraAREffect = this.A02.A01;
        if (cameraAREffect != null) {
            O52 o52 = this.A01;
            if (o52 != null) {
                if (cameraAREffect.A0D()) {
                    String A0j = AbstractC167017dG.A0j();
                    NTT ntt = o52.A00;
                    UserSession userSession = ntt.A07;
                    String str = cameraAREffect.A0B;
                    if (str == null) {
                        str = "";
                    }
                    String str2 = cameraAREffect.A0C;
                    if (str2 == null) {
                        str2 = "";
                    }
                    ImageUrl imageUrl = cameraAREffect.A07;
                    String str3 = cameraAREffect.A0K;
                    String str4 = cameraAREffect.A0M;
                    if (str4 == null) {
                        str4 = "";
                    }
                    String str5 = cameraAREffect.A0S;
                    C14360o3.A07(str5);
                    EffectsPageModel effectsPageModel = new EffectsPageModel(null, imageUrl, null, null, null, null, str, str2, str3, null, str4, str5, "", null, false, false, cameraAREffect.CcN(), true, true, true, true, false);
                    EnumC223429tZ enumC223429tZ = EnumC223429tZ.EFFECT_FOOTER;
                    Bundle A00 = EffectsPageFragment.A00(enumC223429tZ, null, effectsPageModel, null, null, A0j, null, null, null);
                    Activity activity = ntt.A03;
                    String moduleName = ntt.A06.getModuleName();
                    AbstractC40465Hwu.A00(activity, A00, EnumC114925Hg.RTC, enumC223429tZ, C22P.A5N, EnumC50631MWs.A0N, userSession, C05F.A01, moduleName);
                    return;
                }
                return;
            }
            C14360o3.A0F("delegate");
            throw C00O.createAndThrow();
        }
    }

    @Override // X.InterfaceC195318kX
    public final void Di8() {
        CameraAREffect cameraAREffect = this.A02.A01;
        if (cameraAREffect != null) {
            InterfaceC09390do interfaceC09390do = this.A0C;
            if (interfaceC09390do.getValue() != null) {
                O52 o52 = this.A01;
                if (o52 != null) {
                    boolean CcN = cameraAREffect.CcN();
                    NTT ntt = o52.A00;
                    AbstractC166987dD.A1Z(new PZO(cameraAREffect, ntt, null, 27, CcN), ntt.A0D);
                    boolean CcN2 = cameraAREffect.CcN();
                    boolean z = ((C195328kY) interfaceC09390do.getValue()).A01;
                    C195328kY c195328kY = (C195328kY) interfaceC09390do.getValue();
                    boolean z2 = !CcN2;
                    if (z) {
                        c195328kY.setBookmarkIconExpanded(z2);
                        return;
                    } else {
                        c195328kY.setBookmarkIcon(z2);
                        return;
                    }
                }
                C14360o3.A0F("delegate");
                throw C00O.createAndThrow();
            }
        }
    }
}
