package X;

import android.content.Context;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PlatformLogger;
import com.facebook.msys.mci.TraceInfo;
import java.io.IOException;
import java.util.AbstractCollection;
import java.util.Iterator;

/* renamed from: X.Lcd, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48486Lcd implements InterfaceC1345866i {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C48486Lcd(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = obj3;
    }

    public static C42221xC A00(Object obj, Object obj2, Object obj3, int i) {
        return C42221xC.A06(new C48486Lcd(i, obj, obj2, obj3));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0003. Please report as an issue. */
    @Override // X.InterfaceC1345866i
    public final void EpD(C1346766r c1346766r) {
        C41761wQ c41761wQ;
        C42221xC A0K;
        InterfaceC42241xE interfaceC42241xE;
        C41761wQ c41761wQ2;
        C42221xC c42221xC;
        Object obj;
        int i;
        MailboxFutureImpl A0D;
        Object obj2;
        int i2;
        String str;
        switch (this.A00) {
            case 0:
                C47707L4o c47707L4o = (C47707L4o) this.A03;
                c41761wQ = (C41761wQ) this.A01;
                A0K = A00(c47707L4o.A02, c41761wQ, new MM0(c47707L4o, 27), 1).A0K(new C48365Laf(0, c41761wQ, c1346766r, c47707L4o, this.A02));
                interfaceC42241xE = C49726Lxv.A00;
                c41761wQ.A02(A0K, interfaceC42241xE);
                return;
            case 1:
                c41761wQ2 = (C41761wQ) this.A02;
                c42221xC = (C42221xC) this.A01;
                obj = this.A03;
                i = 3;
                C44109JeZ.A00(c42221xC, c41761wQ2, c1346766r, obj, i);
                return;
            case 2:
                LAF laf = (LAF) this.A03;
                c41761wQ = (C41761wQ) this.A01;
                A0K = laf.A02(c41761wQ).A0K(new C48365Laf(1, c41761wQ, c1346766r, laf, this.A02));
                interfaceC42241xE = C49727Lxw.A00;
                c41761wQ.A02(A0K, interfaceC42241xE);
                return;
            case 3:
                c41761wQ2 = (C41761wQ) this.A02;
                c42221xC = (C42221xC) this.A01;
                obj = this.A03;
                i = 5;
                C44109JeZ.A00(c42221xC, c41761wQ2, c1346766r, obj, i);
                return;
            case 4:
                MailboxFeature mailboxFeature = (MailboxFeature) this.A01;
                C83693oE c83693oE = (C83693oE) this.A02;
                Object obj3 = this.A03;
                String str2 = c83693oE.A00;
                C35857FsX c35857FsX = new C35857FsX(0, c1346766r, obj3);
                InterfaceExecutorC135866Co A0C = AbstractC43592JPx.A0C(mailboxFeature, 0);
                MailboxFutureImpl A0D2 = AbstractC43592JPx.A0D(A0C);
                int A00 = AbstractC1346866s.A00(A0D2);
                TraceInfo A0F = AbstractC43592JPx.A0F(c35857FsX, A0D2, "MailboxInstagramSecureMessage", "loadInstagramSecureThreadKeyFromIgThreadId");
                if (!A0C.ELJ(new LUS(mailboxFeature, A0D2, str2, A00, 0))) {
                    A0D2.cancel(false);
                    AbstractC1346866s.A02(A00);
                    AbstractC1346866s.A03(A0F, "MailboxInstagramSecureMessage", "loadInstagramSecureThreadKeyFromIgThreadId");
                }
                PlatformLogger.platformEventLog(5);
                return;
            case 5:
                AbstractCollection abstractCollection = (AbstractCollection) this.A01;
                C91S c91s = (C91S) this.A02;
                Object obj4 = this.A03;
                Iterator it = abstractCollection.iterator();
                while (it.hasNext()) {
                    C2JS A0l = AbstractC25225BEi.A0l(it);
                    C91U c91u = (C91U) A0l.getOptionalEnumField(0, "operation", C91U.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                    if (c91u != null) {
                        str = c91u.name();
                    } else {
                        str = null;
                    }
                    String A09 = A0l.A09("url_chunk");
                    String A0A = A0l.A0A("url_chunk_hash");
                    String A08 = A0l.A08("url_chunk_id");
                    String A0B = A0l.A0B("violation_type");
                    InterfaceExecutorC135866Co ASj = c91s.mMailboxApiHandleMetaProvider.ASj(3);
                    MailboxFutureImpl A0D3 = AbstractC43592JPx.A0D(ASj);
                    AbstractC25231BEo.A1C(ASj, new C91V(A0D3, c91s, str, A09, A0A, A08, A0B), A0D3);
                    A0D3.addResultCallback(new JVL(obj4, 14));
                }
                return;
            case 6:
                C14360o3.A0B(c1346766r, 0);
                K3U k3u = (K3U) this.A01;
                C2JS c2js = (C2JS) this.A02;
                Boolean A0o = AbstractC31174DnI.A0o(c2js, "hidden_words_control_custom_list_enabled", 0);
                String A082 = c2js.A08("hidden_words_control_custom_list_strings");
                Boolean A0o2 = AbstractC31174DnI.A0o(c2js, "hidden_words_control_predefined_enabled", 2);
                Boolean A0o3 = AbstractC31174DnI.A0o(c2js, "on_device_nudity_control_image_scan_enabled", 3);
                InterfaceExecutorC135866Co A0C2 = AbstractC43592JPx.A0C(k3u, 3);
                A0D = AbstractC43592JPx.A0D(A0C2);
                AbstractC25231BEo.A1C(A0C2, new C48190LUo(A0D, k3u, A0o, A0o2, A0o3, A082, 1), A0D);
                obj2 = this.A03;
                i2 = 48;
                A0D.addResultCallback(new C44176Jff(i2, c1346766r, obj2));
                return;
            case 7:
                C14360o3.A0B(c1346766r, 0);
                K3U k3u2 = (K3U) this.A01;
                C2JS c2js2 = (C2JS) this.A02;
                Boolean A0o4 = AbstractC31174DnI.A0o(c2js2, "hidden_words_control_custom_list_enabled", 0);
                String A083 = c2js2.A08("hidden_words_control_custom_list_strings");
                Boolean A0o5 = AbstractC31174DnI.A0o(c2js2, "hidden_words_control_predefined_enabled", 2);
                Boolean A0o6 = AbstractC31174DnI.A0o(c2js2, "on_device_nudity_control_image_scan_enabled", 3);
                InterfaceExecutorC135866Co A0C3 = AbstractC43592JPx.A0C(k3u2, 3);
                A0D = AbstractC43592JPx.A0D(A0C3);
                AbstractC25231BEo.A1C(A0C3, new C48190LUo(A0D, k3u2, A0o4, A0o5, A0o6, A083, 0), A0D);
                obj2 = this.A03;
                i2 = 49;
                A0D.addResultCallback(new C44176Jff(i2, c1346766r, obj2));
                return;
            case 8:
                C14360o3.A0B(c1346766r, 0);
                try {
                    c1346766r.A02(new C132955zK(AbstractC46988Kq7.A00((Context) this.A01, (android.net.Uri) this.A02, ((LEO) this.A03).A00)));
                } catch (IOException e) {
                    c1346766r.A02(new C48496Lcn(e));
                }
                c1346766r.A00();
                return;
            case 9:
                c41761wQ2 = ((L05) this.A03).A00;
                c42221xC = (C42221xC) this.A01;
                obj = this.A02;
                i = 16;
                C44109JeZ.A00(c42221xC, c41761wQ2, c1346766r, obj, i);
                return;
            default:
                ((C56138Ovy) this.A02).A00.A0H((Context) this.A01, (C51740MtP) this.A03, new C48202LVa(c1346766r));
                return;
        }
    }
}
