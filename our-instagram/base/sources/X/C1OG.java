package X;

import android.os.Looper;
import com.instagram.analytics.ppr.loggingdata.PPRLoggingData;
import com.instagram.common.typedurl.ImageCacheKey;
import com.instagram.common.typedurl.ImageLoggingData;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.ImageUrlBase;
import java.lang.ref.WeakReference;
import kotlin.Deprecated;

/* renamed from: X.1OG, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1OG {
    public static C1OF A0R = new C1OF() { // from class: X.1OH
        @Override // X.C1OF
        public final int EKI(String str) {
            return 0;
        }

        @Override // X.C1OF
        public final int EKM(ImageUrl imageUrl, String str, int i, boolean z, boolean z2) {
            if (!AbstractC001900j.A0a(imageUrl.CDP(), ".jpg?", false)) {
                return -1;
            }
            int A00 = AbstractC110254xv.A00(imageUrl);
            if (A00 != -1) {
                if (i == -1) {
                    return A00;
                }
                return Math.min(i, A00);
            }
            return i;
        }
    };
    public static boolean A0S;
    public static boolean A0T;
    public static boolean A0U;
    public C80673iw A04;
    public AbstractC12990ll A05;
    public ImageUrl A06;
    public Object A08;
    public String A09;
    public WeakReference A0A;
    public WeakReference A0B;
    public WeakReference A0C;
    public WeakReference A0D;
    public boolean A0E;
    public boolean A0H;
    public boolean A0I;
    public boolean A0L;
    public boolean A0M;
    public boolean A0O;
    public final InterfaceC222916i A0P;
    public final String A0Q;
    public boolean A0F = false;
    public float A00 = -1.0f;
    public boolean A0N = false;
    public int A03 = -1;
    public int A01 = 1;
    public int A02 = 2;
    public boolean A0J = false;
    public boolean A0G = false;
    public boolean A0K = false;
    public Integer A07 = C05F.A0Y;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Integer] */
    public final InterfaceC59502nt A00() {
        Integer num;
        ImageUrl imageUrl = this.A06;
        boolean z = A0T;
        boolean z2 = A0S;
        boolean z3 = A0U;
        C14360o3.A0B(imageUrl, 0);
        String url = imageUrl.getUrl();
        if (url == 0) {
            num = C05F.A00;
        } else if (url.length() == 0) {
            num = C05F.A01;
        } else {
            if (z && (!z2 || url.startsWith("{"))) {
                try {
                    java.net.URI create = java.net.URI.create(url);
                    C14360o3.A07(create);
                    if (create.isOpaque()) {
                        url = C05F.A0N;
                        num = url;
                    }
                } catch (IllegalArgumentException e) {
                    if (!z3) {
                        num = C05F.A0C;
                    } else {
                        throw new IllegalArgumentException(AnonymousClass001.A0R("Can't process image URL: ", url), e);
                    }
                }
            }
            num = C05F.A0Y;
        }
        this.A07 = num;
        if (num != C05F.A0Y) {
            return new C43615JQy(this);
        }
        return new InterfaceC59502nt(this) { // from class: X.2ns
            public final boolean A00;
            public final float A01;
            public final int A02;
            public final int A03;
            public final int A04;
            public final int A05;
            public final InterfaceC222916i A06;
            public final C1OG A07;
            public final C80673iw A08;
            public final AbstractC12990ll A09;
            public final ImageUrl A0A;
            public final ImageUrl A0B;
            public final ImageUrl A0C;
            public final Object A0D;
            public final String A0E;
            public final String A0F;
            public final WeakReference A0G;
            public final WeakReference A0H;
            public final WeakReference A0I;
            public final WeakReference A0J;
            public final boolean A0K;
            public final boolean A0L;
            public final boolean A0M;
            public final boolean A0N;
            public final boolean A0O;
            public final boolean A0P;
            public final boolean A0Q;

            {
                InterfaceC224217b interfaceC224217b;
                this.A07 = this;
                this.A09 = this.A05;
                ImageUrl imageUrl2 = this.A06;
                if ((imageUrl2 instanceof InterfaceC224217b) && (interfaceC224217b = (InterfaceC224217b) imageUrl2) != null && interfaceC224217b.B39() != null && this.A05 == null) {
                    C0w9.A03("CacheRequest_build_withFallback", "ImageUrl supports expiry and fallback but session is null");
                }
                C14360o3.A06(imageUrl2);
                this.A0C = imageUrl2;
                ImageUrl A00 = AbstractC59522nv.A00(imageUrl2);
                this.A0A = A00;
                InterfaceC222916i interfaceC222916i = this.A0P;
                C14360o3.A06(interfaceC222916i);
                this.A06 = interfaceC222916i;
                Looper.myLooper();
                Looper.getMainLooper();
                A00.AjX();
                this.A0B = A00;
                this.A0F = this.A0Q;
                this.A0G = this.A0A;
                this.A0H = this.A0B;
                this.A0J = this.A0D;
                this.A0I = this.A0C;
                this.A0E = this.A09;
                this.A04 = this.A02;
                this.A0Q = this.A0M;
                this.A0K = this.A0E;
                this.A02 = this.A01;
                this.A0D = this.A08;
                this.A08 = this.A04;
                boolean z4 = this.A0I;
                this.A0N = z4;
                this.A0M = this.A0H;
                this.A00 = this.A0O;
                this.A0L = this.A0F;
                this.A01 = this.A00;
                C1OF c1of = C1OG.A0R;
                int i = this.A03;
                String scansProfile = A00.getScansProfile();
                ImageLoggingData BOm = A00.BOm();
                boolean z5 = false;
                if (BOm != null && ((PPRLoggingData) BOm).A05) {
                    z5 = true;
                }
                this.A05 = c1of.EKM(A00, scansProfile, i, z5, z4);
                this.A03 = C1OG.A0R.EKI(A00.getScansProfile());
                this.A0P = this.A0L;
                this.A0O = this.A0J;
            }

            @Override // X.InterfaceC59502nt
            public final boolean Cbw() {
                return false;
            }

            @Override // X.InterfaceC59502nt
            public final InterfaceC59502nt AIB() {
                C1OG c1og = new C1OG(this.A06, this.A0C, this.A0F);
                c1og.A05 = this.A09;
                c1og.A0I = this.A0N;
                c1og.A0F = this.A0L;
                c1og.A08 = this.A0D;
                c1og.A0O = this.A00;
                c1og.A03 = this.A05;
                return c1og.A00();
            }

            @Override // X.InterfaceC59502nt
            public final boolean ART() {
                return this.A07.A0G;
            }

            @Override // X.InterfaceC59512nu
            public final String AjU() {
                ImageUrlBase imageUrlBase;
                ImageUrl imageUrl2 = this.A0A;
                if (!(imageUrl2 instanceof ImageUrlBase) || (imageUrlBase = (ImageUrlBase) imageUrl2) == null) {
                    return null;
                }
                return imageUrlBase.Amf().name();
            }

            @Override // X.InterfaceC59502nt
            public final String AjY() {
                String str = ((ImageCacheKey) this.A0B.AjX()).A03;
                C14360o3.A07(str);
                return str;
            }

            @Override // X.InterfaceC59502nt
            public final C1NJ Ajp() {
                WeakReference weakReference = this.A0G;
                if (weakReference != null) {
                    return (C1NJ) weakReference.get();
                }
                return null;
            }

            @Override // X.InterfaceC59502nt
            public final InterfaceC58912mp Avt() {
                WeakReference weakReference = this.A0H;
                if (weakReference != null) {
                    return (InterfaceC58912mp) weakReference.get();
                }
                return null;
            }

            @Override // X.InterfaceC59502nt
            public final float Aw0() {
                return this.A01;
            }

            @Override // X.InterfaceC59502nt
            public final ImageUrl BGt() {
                return this.A0A;
            }

            @Override // X.InterfaceC59502nt
            public final int BQ1() {
                return this.A02;
            }

            @Override // X.InterfaceC59502nt
            public final ImageUrl BRz() {
                return this.A0B;
            }

            @Override // X.InterfaceC59502nt
            public final int BTw() {
                return this.A03;
            }

            @Override // X.InterfaceC59502nt
            public final int BU4() {
                return this.A04;
            }

            @Override // X.InterfaceC59502nt
            public final InterfaceC58852mj BU5() {
                WeakReference weakReference = this.A0I;
                if (weakReference != null) {
                    return (InterfaceC58852mj) weakReference.get();
                }
                return null;
            }

            @Override // X.InterfaceC59502nt
            public final String BU6() {
                return this.A0E;
            }

            @Override // X.InterfaceC59502nt
            public final String Ba1() {
                return this.A0B.Ba1();
            }

            @Override // X.InterfaceC59502nt
            public final InterfaceC58872ml BiQ() {
                WeakReference weakReference = this.A0J;
                if (weakReference != null) {
                    return (InterfaceC58872ml) weakReference.get();
                }
                return null;
            }

            @Override // X.InterfaceC59502nt
            public final C80673iw BiR() {
                return this.A08;
            }

            @Override // X.InterfaceC59502nt
            public final int BqU() {
                return this.A05;
            }

            @Override // X.InterfaceC59502nt
            public final boolean Bxi() {
                return this.A07.A0N;
            }

            @Override // X.InterfaceC59502nt
            public final String Byf() {
                return this.A0F;
            }

            @Override // X.InterfaceC59502nt
            public final Object C4x() {
                return this.A0D;
            }

            @Override // X.InterfaceC59512nu
            public final Boolean CPT() {
                return this.A0A.BJa();
            }

            @Override // X.InterfaceC59512nu
            public final boolean CQU() {
                return false;
            }

            @Override // X.InterfaceC59502nt
            public final boolean CUp() {
                return this.A0M;
            }

            @Override // X.InterfaceC59502nt
            public final boolean CXt() {
                return this.A0P;
            }

            @Override // X.InterfaceC59502nt
            public final boolean Cas() {
                return this.A0N;
            }

            @Override // X.InterfaceC59502nt
            public final boolean Cbv() {
                return this.A0O;
            }

            @Override // X.InterfaceC59502nt
            public final boolean CfE() {
                return this.A00;
            }

            @Override // X.InterfaceC59502nt
            public final boolean Cfj() {
                return this.A07.A0K;
            }

            @Override // X.InterfaceC59512nu
            public final String EJC() {
                return this.A0F;
            }

            @Override // X.InterfaceC59502nt
            public final boolean EiI() {
                return this.A0K;
            }

            @Override // X.InterfaceC59502nt
            public final boolean EiO() {
                return this.A0L;
            }

            @Override // X.InterfaceC59502nt
            public final boolean EjG() {
                return this.A0Q;
            }

            @Override // X.InterfaceC59512nu
            public final Integer FDJ() {
                return C05F.A0Y;
            }

            @Override // X.InterfaceC59502nt
            public final AbstractC12990ll getSession() {
                return this.A09;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("CacheRequestImpl: Source = ");
                sb.append(this.A0F);
                sb.append(", mImageUrl = ");
                sb.append(this.A0A);
                return sb.toString();
            }

            @Override // X.InterfaceC59502nt
            public final void E7X() {
                C25821No.A00().A0N(this);
            }

            @Override // X.InterfaceC59502nt
            @Deprecated(message = "")
            public final void cancel() {
                C25821No.A00().A0M(this);
            }

            @Override // X.InterfaceC59502nt
            @Deprecated(message = "no-op, historically there are a lot of call sites that tries to do cancellation without measuring the impact of it. When the cancellation logic was enabled internally, it regresses a lot of metrics. For now, we are going to deprecate all those call sites, and consider re-enabling them one by one.")
            public final void AGO() {
                C25821No.A00();
            }
        };
    }

    public final void A02(C1NJ c1nj) {
        if (c1nj != null) {
            this.A0A = new WeakReference(c1nj);
        }
    }

    public C1OG(InterfaceC222916i interfaceC222916i, ImageUrl imageUrl, String str) {
        this.A06 = imageUrl;
        this.A0P = interfaceC222916i;
        this.A0Q = str == null ? "unknown" : str;
    }

    public final void A01() {
        C25821No.A00().A0N(A00());
    }
}
