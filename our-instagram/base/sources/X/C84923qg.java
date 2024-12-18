package X;

import com.instagram.api.schemas.CommentGiphyMediaInfoIntf;
import com.instagram.api.schemas.CommentRestrictStatus;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/* renamed from: X.3qg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C84923qg {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public C115925Mi A05;
    public EnumC84933qh A06;
    public C38321qM A07;
    public User A08;
    public Integer A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public List A0H;
    public List A0I;
    public List A0J;
    public List A0K;
    public List A0L;
    public List A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public String A0Q;
    public final int A0R;
    public final int A0S;
    public final CommentGiphyMediaInfoIntf A0T;
    public final CommentRestrictStatus A0U;
    public final InterfaceC38901rP A0V;
    public final C115935Mj A0W;
    public final C5FP A0X;
    public final C5FJ A0Y;
    public final InterfaceC110874yz A0Z;
    public final Integer A0a;
    public final String A0b;
    public final String A0c;
    public final String A0d;
    public final String A0e;
    public final String A0f;
    public final Map A0g;
    public final Map A0h;
    public final boolean A0i;
    public final boolean A0j;
    public final boolean A0k;
    public final boolean A0l;
    public final boolean A0m;
    public final boolean A0n;
    public final boolean A0o;
    public final boolean A0p;
    public final boolean A0q;
    public final boolean A0r;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.AbstractCollection, java.util.ArrayList] */
    public C84923qg(InterfaceC38901rP interfaceC38901rP) {
        long j;
        Integer num;
        int i;
        int i2;
        String str;
        int i3;
        Map A0E;
        ?? r3;
        int intValue;
        C14360o3.A0B(interfaceC38901rP, 1);
        this.A0V = interfaceC38901rP;
        String pk = interfaceC38901rP.getPk();
        this.A0G = pk == null ? String.valueOf(super.hashCode()) : pk;
        Long Asa = interfaceC38901rP.Asa();
        if (Asa != null) {
            j = Asa.longValue();
        } else {
            j = 0;
        }
        this.A03 = j;
        String mediaId = interfaceC38901rP.getMediaId();
        this.A0E = mediaId == null ? "" : mediaId;
        String text = interfaceC38901rP.getText();
        this.A0e = text == null ? "" : text;
        Integer CBl = interfaceC38901rP.CBl();
        if (CBl != null && (intValue = CBl.intValue()) != 0 && intValue == 1) {
            num = C05F.A01;
        } else {
            num = C05F.A00;
        }
        this.A0a = num;
        this.A08 = interfaceC38901rP.CDj();
        this.A0i = C14360o3.A0K(interfaceC38901rP.BCr(), true);
        Integer Apd = interfaceC38901rP.Apd();
        if (Apd != null) {
            i = Apd.intValue();
        } else {
            i = 0;
        }
        this.A02 = i;
        this.A0O = C14360o3.A0K(interfaceC38901rP.BC2(), true);
        C14360o3.A0K(interfaceC38901rP.AxM(), true);
        this.A0p = C14360o3.A0K(interfaceC38901rP.BDu(), true);
        this.A0q = C14360o3.A0K(interfaceC38901rP.BwH(), true);
        Integer AnX = interfaceC38901rP.AnX();
        if (AnX != null) {
            i2 = AnX.intValue();
        } else {
            i2 = 0;
        }
        this.A01 = i2;
        this.A0F = interfaceC38901rP.BbH();
        Integer Apa = interfaceC38901rP.Apa();
        if (Apa != null) {
            str = Apa.toString();
        } else {
            str = null;
        }
        this.A0B = str;
        Integer AnY = interfaceC38901rP.AnY();
        this.A0A = AnY != null ? AnY.toString() : null;
        String backgroundColor = interfaceC38901rP.getBackgroundColor();
        this.A0b = backgroundColor == null ? "" : backgroundColor;
        String Aeu = interfaceC38901rP.Aeu();
        this.A0c = Aeu == null ? "" : Aeu;
        String textColor = interfaceC38901rP.getTextColor();
        this.A0f = textColor != null ? textColor : "";
        Integer C6j = interfaceC38901rP.C6j();
        if (C6j != null) {
            i3 = C6j.intValue();
        } else {
            i3 = 0;
        }
        this.A0S = i3;
        this.A0h = interfaceC38901rP.BSP();
        List B07 = interfaceC38901rP.B07();
        this.A0K = B07 == null ? C16930sl.A00 : B07;
        this.A0D = interfaceC38901rP.BQW();
        C14360o3.A0K(interfaceC38901rP.CZM(), true);
        this.A0n = C14360o3.A0K(interfaceC38901rP.CbW(), true);
        this.A0k = C14360o3.A0K(interfaceC38901rP.CVs(), true);
        interfaceC38901rP.BHo();
        this.A0U = interfaceC38901rP.Boq();
        this.A0Y = interfaceC38901rP.Ale();
        this.A0X = interfaceC38901rP.BR3();
        this.A0Z = interfaceC38901rP.BKr();
        this.A0m = C14360o3.A0K(interfaceC38901rP.CaI(), true);
        C14360o3.A0K(interfaceC38901rP.CbP(), true);
        this.A0o = C14360o3.A0K(interfaceC38901rP.CRq(), true);
        C14360o3.A0K(interfaceC38901rP.AlD(), true);
        C14360o3.A0K(interfaceC38901rP.AlM(), true);
        this.A0l = C14360o3.A0K(interfaceC38901rP.CXS(), true);
        C14360o3.A0K(interfaceC38901rP.CXR(), true);
        this.A0j = C14360o3.A0K(interfaceC38901rP.CRr(), true);
        C14360o3.A0K(interfaceC38901rP.Cfs(), true);
        interfaceC38901rP.Bgi();
        C14360o3.A0K(interfaceC38901rP.ApZ(), true);
        List B4l = interfaceC38901rP.B4l();
        if (B4l != null) {
            ArrayList<JLO> arrayList = new ArrayList();
            for (Object obj : B4l) {
                JLO jlo = (JLO) obj;
                int offset = jlo.getOffset();
                int length = jlo.getLength() + offset;
                int length2 = this.A0e.length();
                int min = Math.min(length, length2);
                if (offset < min && min <= length2) {
                    arrayList.add(obj);
                }
            }
            int A0L = AbstractC16850sd.A0L(AbstractC06950Ym.A1E(arrayList, 10));
            A0E = new LinkedHashMap(A0L < 16 ? 16 : A0L);
            for (JLO jlo2 : arrayList) {
                String substring = this.A0e.substring(jlo2.getOffset(), Math.min(jlo2.getOffset() + jlo2.getLength(), this.A0e.length()));
                C14360o3.A07(substring);
                A0E.put(substring, jlo2);
            }
        } else {
            A0E = AbstractC06930Yk.A0E();
        }
        this.A0g = A0E;
        this.A0R = A0E.size();
        this.A0T = this.A0V.B9s();
        this.A0J = this.A0V.Aym();
        this.A0r = C14360o3.A0K(this.A0V.Bwn(), true);
        this.A0I = this.A0V.Am4();
        this.A06 = EnumC84933qh.A09;
        this.A0d = this.A0V.Bn2();
        this.A05 = AbstractC84943qi.A00(this.A0V.AeV());
        C5FM BH1 = this.A0V.BH1();
        this.A0W = BH1 != null ? new C115935Mj(null, BH1.BH2()) : null;
        List Bfk = this.A0V.Bfk();
        if (Bfk != null) {
            r3 = new ArrayList(AbstractC06950Ym.A1E(Bfk, 10));
            Iterator it = Bfk.iterator();
            while (it.hasNext()) {
                r3.add(new C84923qg((InterfaceC38901rP) it.next()));
            }
        } else {
            r3 = C16930sl.A00;
        }
        this.A0L = r3;
    }

    public final String A00() {
        String str = this.A0Q;
        if (str == null) {
            str = UUID.randomUUID().toString();
            this.A0Q = str;
        }
        C14360o3.A0A(str);
        return str;
    }

    public final void A01(C38321qM c38321qM) {
        String str;
        this.A07 = c38321qM;
        if (c38321qM == null || (str = c38321qM.getId()) == null) {
            str = "";
        }
        this.A0E = str;
        if (!this.A0L.isEmpty()) {
            Iterator it = this.A0L.iterator();
            while (it.hasNext()) {
                ((C84923qg) it.next()).A01(c38321qM);
            }
        }
    }

    public final boolean A02() {
        if (this.A0a != C05F.A01) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C84923qg) {
            String str = ((C84923qg) obj).A0G;
            String str2 = this.A0G;
            if (str2 != null && str != null) {
                return str2.equals(str);
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.A0G.hashCode();
    }

    public final String toString() {
        String str;
        Locale locale = Locale.getDefault();
        Long valueOf = Long.valueOf(this.A03);
        User user = this.A08;
        if (user != null) {
            str = user.getUsername();
        } else {
            str = "null";
        }
        String format = String.format(locale, "Comment{mCreatedAtSeconds=%d, mUser=@%s, mText='%s'}", Arrays.copyOf(new Object[]{valueOf, str, this.A0e}, 3));
        C14360o3.A07(format);
        return format;
    }
}
