package X;

import android.util.Pair;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PlatformLogger;
import com.facebook.msys.mci.TraceInfo;
import com.facebook.react.modules.dialog.DialogModule;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Lax, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48383Lax implements C6D2 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;

    public C48383Lax(Object obj, Object obj2, Object obj3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, int i2, int i3) {
        this.A00 = i3;
        this.A04 = obj3;
        this.A06 = str;
        this.A09 = str2;
        this.A05 = obj2;
        this.A0A = str3;
        this.A0B = str4;
        this.A0C = str5;
        this.A03 = obj;
        this.A0D = str6;
        this.A07 = str7;
        this.A01 = i;
        this.A02 = i2;
        this.A08 = str8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v8, types: [org.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r8v6, types: [X.42m, X.MS1] */
    @Override // X.C6D2
    public final Object apply(Object obj) {
        boolean z;
        Object obj2;
        if (this.A00 != 0) {
            JSONObject jSONObject = null;
            byte[] bArr = (byte[]) this.A04;
            Object obj3 = this.A06;
            Object obj4 = this.A09;
            List list = (List) this.A05;
            Object obj5 = this.A0A;
            Object obj6 = this.A0B;
            Object obj7 = this.A0C;
            final InterfaceC132965zL interfaceC132965zL = (InterfaceC132965zL) this.A03;
            final String str = this.A0D;
            final String str2 = this.A07;
            final int i = this.A01;
            final int i2 = this.A02;
            final String str3 = this.A08;
            Pair pair = (Pair) obj;
            K3a k3a = (K3a) pair.first;
            final C1345666g c1345666g = (C1345666g) pair.second;
            final String A03 = C6JY.A03(k3a, bArr);
            C18C.A07(A03, "Failed to resolve preview ID");
            if (obj3 != null && obj4 != null) {
                jSONObject = AbstractC31171DnF.A0q();
                try {
                    jSONObject.put("music_preview_url", obj3);
                } catch (JSONException unused) {
                }
                z = true;
                try {
                    jSONObject.put("music_preview_url_type", obj4);
                } catch (JSONException unused2) {
                }
                try {
                    if (list != null) {
                        obj2 = new JSONArray();
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            obj2.put(it.next());
                        }
                    } else {
                        obj2 = JSONObject.NULL;
                    }
                    jSONObject.put("music_preview_country_restrictions", obj2);
                } catch (JSONException unused3) {
                }
            } else {
                z = false;
            }
            JSONObject A0q = AbstractC31171DnF.A0q();
            try {
                A0q.put("target_type", EnumC46255KdX.A0E.toString());
            } catch (JSONException unused4) {
            }
            JSONObject A0q2 = AbstractC31171DnF.A0q();
            JSONObject A0q3 = AbstractC31171DnF.A0q();
            if (obj5 == null) {
                try {
                    obj5 = JSONObject.NULL;
                } catch (JSONException unused5) {
                }
            }
            A0q3.put(DialogModule.KEY_TITLE, obj5);
            if (obj6 == null) {
                try {
                    obj6 = JSONObject.NULL;
                } catch (JSONException unused6) {
                }
            }
            A0q3.put("subtitle", obj6);
            try {
                A0q2.put("body", A0q3);
            } catch (JSONException unused7) {
            }
            JSONObject A0q4 = AbstractC31171DnF.A0q();
            if (obj7 == null) {
                try {
                    obj7 = JSONObject.NULL;
                } catch (JSONException unused8) {
                }
            }
            A0q4.put("cta", obj7);
            try {
                A0q2.put("default_cta", A0q4);
            } catch (JSONException unused9) {
            }
            Object obj8 = jSONObject;
            if (!z) {
                try {
                    obj8 = JSONObject.NULL;
                } catch (JSONException unused10) {
                }
            }
            A0q2.put("music_preview", obj8);
            try {
                A0q2.put("__typename", "XMSGXmaSingleContent");
            } catch (JSONException unused11) {
            }
            try {
                A0q.put("content", A0q2);
            } catch (JSONException unused12) {
            }
            final ?? abstractC907342m = new AbstractC907342m(A0q);
            return C42221xC.A07(new InterfaceC1345866i() { // from class: X.LcQ
                @Override // X.InterfaceC1345866i
                public final void EpD(C1346766r c1346766r) {
                    C1345666g c1345666g2 = C1345666g.this;
                    InterfaceC132965zL interfaceC132965zL2 = interfaceC132965zL;
                    String str4 = str;
                    MS1 ms1 = abstractC907342m;
                    String str5 = A03;
                    String str6 = str2;
                    int i3 = i;
                    int i4 = i2;
                    String str7 = str3;
                    long A09 = JQ0.A09(interfaceC132965zL2);
                    Integer valueOf = Integer.valueOf(i3);
                    Integer valueOf2 = Integer.valueOf(i4);
                    JRS A00 = JRS.A00(c1346766r, 65);
                    InterfaceExecutorC135866Co A0C = AbstractC43592JPx.A0C(c1345666g2, 0);
                    MailboxFutureImpl A0D = AbstractC43592JPx.A0D(A0C);
                    int A002 = AbstractC1346866s.A00(A0D);
                    TraceInfo A0F = AbstractC43592JPx.A0F(A00, A0D, "MailboxInstagramSecureMessage", "runInstagramXmaSendStandaloneV2");
                    if (!A0C.ELJ(new YBS(c1345666g2, ms1, A0D, valueOf, valueOf2, str4, str5, str6, str7, A002, A09))) {
                        A0D.cancel(false);
                        AbstractC1346866s.A02(A002);
                        AbstractC1346866s.A03(A0F, "MailboxInstagramSecureMessage", "runInstagramXmaSendStandaloneV2");
                    }
                    PlatformLogger.platformEventLog(5);
                }
            }, AbstractC137146It.A00("instagram_xma_external_link_client_send"));
        }
        C6JY c6jy = (C6JY) this.A04;
        Object obj9 = this.A05;
        String str4 = this.A08;
        String str5 = this.A09;
        Object obj10 = this.A03;
        String str6 = this.A0A;
        String str7 = this.A0B;
        String str8 = this.A0C;
        String str9 = this.A0D;
        String str10 = this.A06;
        int i3 = this.A01;
        int i4 = this.A02;
        String str11 = this.A07;
        InterfaceC132965zL interfaceC132965zL2 = (InterfaceC132965zL) obj;
        if (interfaceC132965zL2 instanceof C48496Lcn) {
            return C48496Lcn.A00(interfaceC132965zL2);
        }
        return C48331La4.A00(c6jy).A0L(new C48383Lax(interfaceC132965zL2, obj10, obj9, str4, str5, str6, str7, str8, str9, str10, str11, i3, i4, 1));
    }
}
