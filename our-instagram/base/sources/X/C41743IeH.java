package X;

import com.instagram.api.schemas.RingSpec;
import com.instagram.api.schemas.RingSpecImpl;
import java.util.HashMap;

/* renamed from: X.IeH, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41743IeH {
    public int A00;
    public RingSpecImpl A01;
    public C114665Fw A02;
    public C914346k A03;
    public C38561qk A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public HashMap A0A;
    public HashMap A0B;
    public HashMap A0C;
    public boolean A0D;

    public static void A00(C41743IeH c41743IeH) {
        c41743IeH.A0A = new HashMap();
        c41743IeH.A0B = new HashMap();
        c41743IeH.A0C = new HashMap();
    }

    public C41743IeH(JLY jly) {
        A00(this);
        this.A06 = jly.AgO();
        this.A09 = jly.getId();
        this.A0D = AbstractC167007dF.A1T(jly.BvJ());
        this.A00 = AbstractC25227BEk.A06(jly.Bx0(), 0);
    }

    public C41743IeH(RingSpec ringSpec, C38561qk c38561qk, String str) {
        RingSpecImpl ringSpecImpl;
        A00(this);
        this.A09 = str;
        if (ringSpec != null) {
            ringSpecImpl = ringSpec.EzF();
        } else {
            ringSpecImpl = null;
        }
        this.A01 = ringSpecImpl;
        this.A04 = c38561qk;
    }

    public C41743IeH(String str, HashMap hashMap) {
        A00(this);
        this.A09 = str;
        this.A0B = hashMap;
    }

    public C41743IeH() {
        A00(this);
    }
}
