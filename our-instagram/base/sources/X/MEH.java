package X;

import android.content.Context;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.direct.fragment.thread.threaddetail.customization.ThreadDetailCustomGroupNameAndImageViewModel$PickerItem$EmojiItem;

/* loaded from: classes8.dex */
public final class MEH extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;
    public final Object A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MEH(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, int i) {
        super(0);
        this.A00 = i;
        this.A02 = obj;
        this.A03 = obj2;
        this.A06 = obj3;
        this.A09 = obj4;
        this.A05 = obj5;
        this.A08 = obj6;
        this.A04 = obj7;
        this.A01 = obj8;
        this.A07 = obj9;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        if (this.A00 != 0) {
            int intValue = ((C27207BzQ) this.A07).A02.intValue();
            if (intValue != 0) {
                if (intValue != 1) {
                    if (intValue == 2) {
                        ((L7D) this.A06).A00(EnumC46300KeW.TAP_IMAGINE_BUTTON, null);
                        FPE fpe = (FPE) this.A02;
                        Object obj = this.A04;
                        C14360o3.A0B(obj, 0);
                        AbstractC52922bZ A0Z = AbstractC25225BEi.A0Z(fpe.A00.A03);
                        GSS.A02(obj, A0Z, AbstractC141776au.A00(A0Z), 27);
                    } else {
                        throw B4Z.A00();
                    }
                } else {
                    ((L7D) this.A06).A00(EnumC46300KeW.TAP_CHANGE_IMAGE, null);
                    FPE fpe2 = (FPE) this.A02;
                    AbstractC59962oe abstractC59962oe = (AbstractC59962oe) this.A04;
                    C14360o3.A0B(abstractC59962oe, 0);
                    C44538Jmi c44538Jmi = (C44538Jmi) fpe2.A00.A03.getValue();
                    UserSession userSession = c44538Jmi.A00;
                    C18920wW A0O = AbstractC31176DnK.A0O(userSession, abstractC59962oe.getModuleName());
                    InterfaceC83733oI interfaceC83733oI = c44538Jmi.A04;
                    new WDF(abstractC59962oe, A0O, userSession, AbstractC1345466e.A05(interfaceC83733oI), AbstractC31171DnF.A0c(interfaceC83733oI), AbstractC1345466e.A07(interfaceC83733oI), 0, 47).A02(false);
                }
            } else {
                L7D l7d = (L7D) this.A06;
                l7d.A00(EnumC46300KeW.TAP_CHANGE_IMAGE_PLUS, null);
                UserSession userSession2 = (UserSession) this.A09;
                ThreadDetailCustomGroupNameAndImageViewModel$PickerItem$EmojiItem threadDetailCustomGroupNameAndImageViewModel$PickerItem$EmojiItem = (ThreadDetailCustomGroupNameAndImageViewModel$PickerItem$EmojiItem) this.A08;
                String str = l7d.A00;
                String str2 = l7d.A01;
                C14360o3.A0B(userSession2, 0);
                C26709Bqq c26709Bqq = new C26709Bqq();
                Bundle A0b = AbstractC166987dD.A0b();
                AbstractC60492pY.A04(A0b, userSession2);
                A0b.putParcelable("selected_emoji_item", threadDetailCustomGroupNameAndImageViewModel$PickerItem$EmojiItem);
                A0b.putString("analytics_customization_flow_entrypoint", str);
                A0b.putString(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str2);
                c26709Bqq.setArguments(A0b);
                c26709Bqq.A00 = (FPE) this.A02;
                C3DN A01 = C3DN.A00.A01((Context) this.A01);
                if (A01 != null) {
                    A01.A0K(c26709Bqq);
                } else {
                    throw AbstractC166997dE.A0g();
                }
            }
            ((C58Y) this.A03).AHm(false);
            C5D2 c5d2 = (C5D2) this.A05;
            if (c5d2 != null) {
                c5d2.hide();
            }
            return C0eB.A00;
        }
        C2049094y c2049094y = C2049094y.$redex_init_class;
        Context context = (Context) this.A02;
        AnonymousClass952 anonymousClass952 = (AnonymousClass952) ((InterfaceC09390do) this.A05).getValue();
        AnonymousClass953 anonymousClass953 = (AnonymousClass953) ((InterfaceC09390do) this.A08).getValue();
        AnonymousClass954 anonymousClass954 = (AnonymousClass954) ((InterfaceC09390do) this.A04).getValue();
        return new C2049094y(context, (C0JM) AbstractC166987dD.A17((InterfaceC09390do) this.A01), (C2049194z) this.A03, anonymousClass953, anonymousClass954, anonymousClass952, (AnonymousClass950) this.A06, (AnonymousClass956) ((InterfaceC09390do) this.A07).getValue(), ((UserSession) this.A09).userId);
    }
}
