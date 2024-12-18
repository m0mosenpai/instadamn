package X;

import android.app.Activity;
import android.content.Context;
import android.widget.CompoundButton;
import com.instagram.bugreporter.BugReportSevereSwitchView;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.textcell.IgdsListCell;
import com.instagram.leadgen.core.model.LeadGenFormBaseQuestion;
import com.instagram.leadgen.core.ui.LeadGenFormStoreLocatorView;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* renamed from: X.Ol9, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55516Ol9 implements CompoundButton.OnCheckedChangeListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C55516Ol9(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj3;
        this.A02 = obj;
        this.A01 = obj2;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        Map map;
        String str;
        String str2;
        C23031Ai c23031Ai;
        InterfaceC16530ry interfaceC16530ry;
        C0YR[] c0yrArr;
        int i;
        C50985Mfs c50985Mfs;
        ArrayList A0U;
        switch (this.A00) {
            case 0:
                C102884kP c102884kP = (C102884kP) this.A02;
                InterfaceC103384lE interfaceC103384lE = (InterfaceC103384lE) this.A03;
                C6FP.A03((C6FG) this.A01, c102884kP, AbstractC31179DnN.A0I(c102884kP).A00(), interfaceC103384lE);
                return;
            case 1:
                if (!z) {
                    return;
                }
                BugReportSevereSwitchView.A01((BugReportSevereSwitchView) this.A03, (UserSession) this.A02, (OHF) this.A01, true);
                return;
            case 2:
                C45527KDs c45527KDs = (C45527KDs) ((KDI) this.A03).A08.getValue();
                EnumC46248KdP enumC46248KdP = (EnumC46248KdP) this.A01;
                C05A c05a = c45527KDs.A02;
                java.util.Set set = (java.util.Set) c05a.getValue();
                if (z) {
                    LinkedHashSet A00 = AnonymousClass090.A00(AbstractC16830sb.A06(enumC46248KdP), set);
                    C14360o3.A0C(A00, "null cannot be cast to non-null type kotlin.collections.MutableSet<com.instagram.direct.wellbeing.unknowncontact.messagerequests.pendingthreads.filter.intf.PendingThreadsFilter>");
                    c05a.Egh(C15500q5.A05(A00));
                    map = (Map) c45527KDs.A03.getValue();
                    str = enumC46248KdP.A02;
                    str2 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
                } else {
                    java.util.Set A03 = AnonymousClass090.A03(enumC46248KdP, set);
                    C14360o3.A0C(A03, "null cannot be cast to non-null type kotlin.collections.MutableSet<com.instagram.direct.wellbeing.unknowncontact.messagerequests.pendingthreads.filter.intf.PendingThreadsFilter>");
                    c05a.Egh(C15500q5.A05(A03));
                    map = (Map) c45527KDs.A03.getValue();
                    str = enumC46248KdP.A02;
                    str2 = "0";
                }
                map.put(str, str2);
                AbstractC25227BEk.A1Q((InterfaceC16660sJ) this.A02, z);
                return;
            case 3:
                if (!z) {
                    return;
                }
                LeadGenFormStoreLocatorView leadGenFormStoreLocatorView = (LeadGenFormStoreLocatorView) this.A03;
                LeadGenFormBaseQuestion leadGenFormBaseQuestion = (LeadGenFormBaseQuestion) this.A01;
                String str3 = ((C51612Mr5) this.A02).A03;
                String str4 = str3;
                if (str3 == null) {
                    str4 = "";
                }
                leadGenFormStoreLocatorView.A0F(leadGenFormBaseQuestion, str4);
                Iterator A15 = AbstractC166997dE.A15(leadGenFormStoreLocatorView.A05);
                while (A15.hasNext()) {
                    Map.Entry A1K = AbstractC166987dD.A1K(A15);
                    ((IgdsListCell) A1K.getValue()).setChecked(C14360o3.A0K(A1K.getKey(), str3));
                }
                return;
            case 4:
            case 5:
            default:
                OI0 oi0 = ((C52775NXg) this.A03).A00;
                if (oi0 != null) {
                    oi0.A00((C51757Mtg) this.A02, (BJF) this.A01, z);
                    return;
                }
                return;
            case 6:
                C52777NXj c52777NXj = (C52777NXj) this.A01;
                Activity rootActivity = c52777NXj.getRootActivity();
                rootActivity.getClass();
                boolean A05 = AbstractC23451Ch.A05(rootActivity, "android.permission.WRITE_EXTERNAL_STORAGE");
                if (!z) {
                    int A0H = AbstractC166987dD.A0H(this.A02);
                    if (A0H != 0) {
                        if (A0H != 1) {
                            if (A0H != 2) {
                                return;
                            }
                            C23031Ai A002 = AbstractC23021Ah.A00(c52777NXj.A00);
                            AbstractC167007dF.A1L(A002, A002.A7r, C23031Ai.A8c, 31, false);
                            return;
                        }
                        c23031Ai = (C23031Ai) this.A03;
                        interfaceC16530ry = c23031Ai.A7G;
                        c0yrArr = C23031Ai.A8c;
                        i = 33;
                    } else {
                        c23031Ai = (C23031Ai) this.A03;
                        interfaceC16530ry = c23031Ai.A7F;
                        c0yrArr = C23031Ai.A8c;
                        i = 32;
                    }
                    AbstractC167007dF.A1L(c23031Ai, interfaceC16530ry, c0yrArr, i, false);
                    return;
                }
                AbstractC23451Ch.A04(rootActivity, new C56067Ouk(rootActivity, this, A05), "android.permission.WRITE_EXTERNAL_STORAGE");
                return;
            case 7:
                N4M n4m = (N4M) this.A03;
                InterfaceC09390do interfaceC09390do = n4m.A02;
                List A003 = ((C50985Mfs) interfaceC09390do.getValue()).A00();
                if (z) {
                    Object obj = this.A01;
                    if (A003.contains(obj)) {
                        return;
                    }
                    c50985Mfs = (C50985Mfs) interfaceC09390do.getValue();
                    A0U = AbstractC001800i.A0U(c50985Mfs.A00());
                    A0U.add(obj);
                } else {
                    if (A003.size() <= 1) {
                        Object obj2 = this.A02;
                        Object obj3 = this.A01;
                        Context requireContext = n4m.requireContext();
                        C193328hC A0I = AbstractC31171DnF.A0I(requireContext);
                        A0I.A0A(2131955330);
                        AbstractC31173DnH.A16(requireContext, A0I, 2131955327);
                        A0I.A0M(DialogInterfaceOnClickListenerC55321Ogj.A00(obj3, n4m, 65), 2131955328);
                        A0I.A0H(DialogInterfaceOnClickListenerC55320Ogi.A00(obj2, 59), 2131955329);
                        A0I.A0t(false);
                        AbstractC166987dD.A1W(A0I);
                        return;
                    }
                    c50985Mfs = (C50985Mfs) interfaceC09390do.getValue();
                    Object obj4 = this.A01;
                    A0U = AbstractC001800i.A0U(c50985Mfs.A00());
                    A0U.remove(obj4);
                }
                c50985Mfs.A02.A0B(A0U);
                return;
        }
    }
}
