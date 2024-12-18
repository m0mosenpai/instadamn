package X;

import com.google.common.collect.ImmutableList;
import com.instagram.discovery.mediamap.model.LocationPageInformation;
import com.instagram.discovery.mediamap.model.MediaMapPin;

/* loaded from: classes11.dex */
public final class WW5 implements InterfaceC48192Ji {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public WW5(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj3;
        this.A03 = obj;
    }

    @Override // X.InterfaceC48192Ji
    public final void invoke(AnonymousClass436 anonymousClass436) {
        Object Bos;
        C2JS c2js;
        C2JS A03;
        ImmutableList A06;
        C2JS c2js2;
        switch (this.A00) {
            case 0:
                C60622REh c60622REh = (C60622REh) this.A01;
                C2n2 c2n2 = (C2n2) this.A02;
                InterfaceC48212Jk interfaceC48212Jk = (InterfaceC48212Jk) this.A03;
                if (anonymousClass436 != null && (Bos = anonymousClass436.Bos()) != null) {
                    try {
                        Object apply = c2n2.apply(Bos);
                        apply.getClass();
                        c60622REh.A00 = new C62678SLr(anonymousClass436.B8f(), apply, null);
                        c60622REh.A03(c60622REh.A00);
                        return;
                    } catch (Exception e) {
                        interfaceC48212Jk.invoke(e);
                        return;
                    }
                }
                interfaceC48212Jk.invoke(new RuntimeException(AbstractC58317Pt9.A00(181)));
                return;
            case 1:
                MediaMapPin mediaMapPin = (MediaMapPin) this.A01;
                C69786VvR c69786VvR = (C69786VvR) this.A02;
                C69619VsM c69619VsM = (C69619VsM) this.A03;
                LocationPageInformation A01 = VVH.A00(anonymousClass436, AbstractC69973Vyo.A01(mediaMapPin)).A01();
                MediaMapPin clone = mediaMapPin.clone();
                clone.A0F = false;
                clone.A06 = A01;
                c69786VvR.A02(c69619VsM, clone);
                return;
            default:
                if (anonymousClass436 != null && (c2js = (C2JS) anonymousClass436.Bos()) != null && (A03 = c2js.A03(C67136Uh6.class, "xfb_fx_sso_info(account_type:\"FACEBOOK\")", -238802833)) != null && (A06 = A03.A06(C67135Uh5.class, "sso_account_info", 1262586161)) != null && (c2js2 = (C2JS) AbstractC001800i.A0J(A06)) != null) {
                    boolean coercedBooleanField = c2js2.getCoercedBooleanField(0, "sso_setting_enabled");
                    if (Boolean.valueOf(coercedBooleanField) != null) {
                        ((C70806WhM) this.A03).A00 = coercedBooleanField;
                    }
                }
                C14510oO c14510oO = (C14510oO) this.A01;
                if (!c14510oO.A00) {
                    C69249VkI c69249VkI = (C69249VkI) this.A02;
                    if (c69249VkI != null) {
                        if (!((C70806WhM) this.A03).A00) {
                            AbstractC35092Fd3.A02(c69249VkI.A00);
                            c69249VkI.A01.onAuthorizeFail();
                        } else {
                            c69249VkI.A01.onAuthorizeSuccess(c69249VkI.A03, c69249VkI.A02);
                        }
                    }
                    c14510oO.A00 = true;
                    return;
                }
                return;
        }
    }
}
