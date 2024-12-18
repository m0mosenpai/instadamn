package X;

import com.facebook.graphservice.interfaces.FromStringAble;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.pando.TreeJNI;
import com.facebookpay.common.recyclerview.adapteritems.PuxContactItem;
import com.facebookpay.logging.LoggingContext;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes8.dex */
public final class MI9 extends C0YY implements InterfaceC16660sJ {
    public final int A00;
    public final Object A01;
    public final String A02;
    public final String A03;

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0003. Please report as an issue. */
    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Long l;
        String str;
        switch (this.A00) {
            case 0:
                R8Y r8y = ((C58887QEx) this.A01).A03;
                if (r8y != null) {
                    r8y.handleMessage(this.A02, this.A03);
                }
                return C0eB.A00;
            case 1:
                String str2 = this.A02;
                String str3 = this.A03;
                TreeJNI.parseStringDef((String) obj, str2, str3, (FromStringAble) this.A01);
                return str3;
            case 2:
                if (obj == null) {
                    return null;
                }
                TreeJNI treeJNI = TreeJNI.$redex_init_class;
                throw AbstractC166987dD.A15("fromString");
            case 3:
                C14360o3.A0B(obj, 0);
                TreeJNI treeJNI2 = TreeJNI.$redex_init_class;
                throw AbstractC166987dD.A15("fromString");
            case 4:
                boolean A1a = AbstractC166987dD.A1a(obj);
                Wap A0H = AbstractC43592JPx.A0H();
                UFX ufx = (UFX) this.A01;
                LoggingContext loggingContext = ufx.A1P;
                String str4 = this.A03;
                PuxContactItem puxContactItem = (PuxContactItem) ufx.A0I.A01;
                if (puxContactItem != null && (str = puxContactItem.A02) != null) {
                    l = AbstractC25228BEl.A13(str);
                } else {
                    l = null;
                }
                C70073W1q A05 = ufx.A1Q.A05();
                String str5 = this.A02;
                LinkedHashMap A0n = JQ0.A0n(A05, A1a);
                if (str5 != null) {
                    A0n.put("selected_contact_state", str5);
                }
                A0H.A0J(loggingContext, l, str4, A0n);
                return C0eB.A00;
            case 5:
                C166137bh c166137bh = (C166137bh) obj;
                C14360o3.A0B(c166137bh, 0);
                return AbstractC166327c1.A06(c166137bh, this.A03, this.A02, new C50368MLv(this.A01, 20));
            case 6:
                return C28223CcT.A00((C28223CcT) this.A01, this.A03, this.A02, AbstractC166987dD.A0H(obj));
            case 7:
                MailboxFeature mailboxFeature = (MailboxFeature) obj;
                C14360o3.A0B(mailboxFeature, 0);
                String str6 = this.A02;
                String str7 = this.A03;
                JRS A00 = JRS.A00(this.A01, 30);
                InterfaceExecutorC135866Co A0H2 = AbstractC43593JPy.A0H(mailboxFeature);
                MailboxFutureImpl A0I = AbstractC43593JPy.A0I(A0H2, A00);
                AbstractC25231BEo.A1C(A0H2, new LUT(mailboxFeature, A0I, str6, str7, 0), A0I);
                return C0eB.A00;
            default:
                C32055E6h c32055E6h = (C32055E6h) obj;
                if (c32055E6h.A03 == EnumC33345Eoe.A02) {
                    ((AbstractC43842Ja5) this.A01).updateUi(MXS.A04, C16930sl.A00);
                } else {
                    List list = c32055E6h.A0C;
                    AbstractC32707EaY abstractC32707EaY = (AbstractC32707EaY) this.A01;
                    String str8 = this.A03;
                    String str9 = this.A02;
                    ArrayList A0q = AbstractC167017dG.A0q(list);
                    int i = 0;
                    for (Object obj2 : list) {
                        int i2 = i + 1;
                        if (i < 0) {
                            AbstractC16960so.A1U();
                            throw C00O.createAndThrow();
                        }
                        C32716Eah c32716Eah = (C32716Eah) obj2;
                        c32716Eah.A00 = new C37063GUx(abstractC32707EaY, c32055E6h, c32716Eah, str8, str9, i);
                        A0q.add(c32716Eah);
                        i = i2;
                    }
                    boolean isEmpty = A0q.isEmpty();
                    List list2 = A0q;
                    if (isEmpty) {
                        list2 = A0q;
                        if (C14360o3.A0K(str8, "stacks")) {
                            List list3 = c32055E6h.A0D;
                            C14360o3.A0A(list3);
                            list2 = list3;
                        }
                    }
                    C45209Jzp c45209Jzp = c32055E6h.A02;
                    List list4 = list2;
                    if (c45209Jzp != null) {
                        ArrayList A0U = AbstractC001800i.A0U(list2);
                        A0U.add(0, c45209Jzp);
                        list4 = A0U;
                    }
                    List list5 = c32055E6h.A0E;
                    C14360o3.A0B(list5, 0);
                    abstractC32707EaY.A02 = list5;
                    abstractC32707EaY.A0B(list4);
                }
                return C0eB.A00;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MI9(Object obj, String str, String str2, int i) {
        super(1);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
        this.A03 = str2;
    }
}
