package X;

import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.AdFormatType;
import com.instagram.api.schemas.DynamicProductAdDisplayOption;
import com.instagram.api.schemas.IGCTMessagingAdsInfoDictIntf;
import com.instagram.api.schemas.IntentAwareAdsInfoIntf;
import com.instagram.model.showreelnative.IgShowreelNativeAnimationIntf;
import java.util.Collection;
import java.util.List;

/* renamed from: X.1ux, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC40901ux {
    public ImmutableList A00;
    public AdFormatType A01;
    public InterfaceC104774nh A02;
    public InterfaceC39271s5 A03;
    public InterfaceC104814nm A04;
    public InterfaceC87893vx A05;
    public InterfaceC87573vP A06;
    public InterfaceC104824nn A07;
    public InterfaceC104804nl A08;
    public DynamicProductAdDisplayOption A09;
    public C114595Ff A0A;
    public IGCTMessagingAdsInfoDictIntf A0B;
    public InterfaceC39281s8 A0C;
    public InterfaceC104914o3 A0D;
    public IntentAwareAdsInfoIntf A0E;
    public InterfaceC104934o6 A0F;
    public C5G3 A0G;
    public C47W A0H;
    public InterfaceC39571se A0I;
    public C46j A0J;
    public InterfaceC104924o5 A0K;
    public C38321qM A0L;
    public EnumC40111tc A0M;
    public IgShowreelNativeAnimationIntf A0N;
    public InterfaceC38221qC A0O;
    public C4o9 A0P;
    public InterfaceC104954oA A0Q;
    public Boolean A0R;
    public Boolean A0S;
    public Boolean A0T = false;
    public Boolean A0U;
    public Boolean A0V;
    public Integer A0W;
    public Integer A0X;
    public String A0Y;
    public String A0Z;
    public String A0a;
    public String A0b;
    public String A0c;
    public String A0d;
    public String A0e;
    public String A0f;
    public String A0g;
    public String A0h;
    public String A0i;
    public String A0j;
    public String A0k;
    public String A0l;
    public List A0m;
    public List A0n;
    public List A0o;
    public List A0p;
    public List A0q;
    public boolean A0r;
    public boolean A0s;
    public boolean A0t;

    public final void A00() {
        boolean A67;
        ImmutableList of;
        C38321qM c38321qM = this.A0L;
        if (c38321qM != null) {
            String str = this.A0g;
            if (str == null) {
                str = c38321qM.A32();
            }
            this.A0g = str;
            List list = this.A0q;
            if (list == null) {
                list = c38321qM.A3s();
            }
            this.A0q = list;
            String str2 = this.A0l;
            if (str2 == null) {
                str2 = c38321qM.A33();
            }
            this.A0l = str2;
            String str3 = this.A0b;
            if (str3 == null) {
                str3 = c38321qM.A2X();
            }
            this.A0b = str3;
            if (this.A00 == null) {
                List A3X = c38321qM.A3X();
                if (A3X != null) {
                    of = ImmutableList.copyOf((Collection) A3X);
                } else {
                    of = ImmutableList.of();
                }
                this.A00 = of;
            }
            String str4 = this.A0Z;
            if (str4 == null) {
                str4 = c38321qM.A2W();
            }
            this.A0Z = str4;
            String str5 = this.A0h;
            if (str5 == null) {
                str5 = c38321qM.A0C.BNT();
            }
            this.A0h = str5;
            List list2 = this.A0m;
            if (list2 == null) {
                list2 = c38321qM.A3Y();
            }
            this.A0m = list2;
            InterfaceC87573vP interfaceC87573vP = this.A06;
            if (interfaceC87573vP == null) {
                InterfaceC39541sb injected = c38321qM.A0C.getInjected();
                if (injected != null) {
                    interfaceC87573vP = injected.Atv();
                } else {
                    interfaceC87573vP = null;
                }
            }
            this.A06 = interfaceC87573vP;
            String str6 = this.A0e;
            if (str6 == null) {
                str6 = c38321qM.A0C.getDominantColor();
            }
            this.A0e = str6;
            String str7 = this.A0a;
            if (str7 == null) {
                str7 = c38321qM.A0C.Baa();
            }
            this.A0a = str7;
            IGCTMessagingAdsInfoDictIntf iGCTMessagingAdsInfoDictIntf = this.A0B;
            if (iGCTMessagingAdsInfoDictIntf == null) {
                iGCTMessagingAdsInfoDictIntf = c38321qM.A1I();
            }
            this.A0B = iGCTMessagingAdsInfoDictIntf;
            InterfaceC39281s8 interfaceC39281s8 = this.A0C;
            if (interfaceC39281s8 == null) {
                InterfaceC39541sb injected2 = c38321qM.A0C.getInjected();
                if (injected2 != null) {
                    interfaceC39281s8 = injected2.Ann();
                } else {
                    interfaceC39281s8 = null;
                }
            }
            this.A0C = interfaceC39281s8;
            InterfaceC104824nn interfaceC104824nn = this.A07;
            if (interfaceC104824nn == null) {
                InterfaceC39541sb injected3 = c38321qM.A0C.getInjected();
                if (injected3 != null) {
                    interfaceC104824nn = injected3.Au1();
                } else {
                    interfaceC104824nn = null;
                }
            }
            this.A07 = interfaceC104824nn;
            C47W c47w = this.A0H;
            if (c47w == null) {
                InterfaceC39541sb injected4 = c38321qM.A0C.getInjected();
                if (injected4 != null) {
                    c47w = injected4.BiD();
                } else {
                    c47w = null;
                }
            }
            this.A0H = c47w;
            InterfaceC104804nl interfaceC104804nl = this.A08;
            if (interfaceC104804nl == null && (interfaceC104804nl = c38321qM.A0C.Aso()) == null) {
                InterfaceC39541sb injected5 = c38321qM.A0C.getInjected();
                if (injected5 != null) {
                    interfaceC104804nl = injected5.Asp();
                } else {
                    interfaceC104804nl = null;
                }
            }
            this.A08 = interfaceC104804nl;
            String str8 = this.A0d;
            if (str8 == null) {
                str8 = c38321qM.A2b();
            }
            this.A0d = str8;
            String str9 = this.A0c;
            if (str9 == null) {
                str9 = c38321qM.A2Z();
            }
            this.A0c = str9;
            String str10 = this.A0k;
            if (str10 == null) {
                str10 = c38321qM.A2y();
            }
            this.A0k = str10;
            String str11 = this.A0Y;
            if (str11 == null) {
                str11 = c38321qM.A2V();
            }
            this.A0Y = str11;
            InterfaceC38221qC interfaceC38221qC = this.A0O;
            if (interfaceC38221qC == null) {
                interfaceC38221qC = c38321qM.A26();
            }
            this.A0O = interfaceC38221qC;
            Integer num = this.A0W;
            if (num == null) {
                num = c38321qM.BA3();
            }
            this.A0W = num;
            InterfaceC39571se interfaceC39571se = this.A0I;
            if (interfaceC39571se == null) {
                interfaceC39571se = c38321qM.A0C.BJz();
            }
            this.A0I = interfaceC39571se;
            Integer num2 = this.A0X;
            if (num2 == null) {
                num2 = c38321qM.A0C.CFr();
            }
            this.A0X = num2;
            IgShowreelNativeAnimationIntf igShowreelNativeAnimationIntf = this.A0N;
            if (igShowreelNativeAnimationIntf == null) {
                igShowreelNativeAnimationIntf = c38321qM.A0C.Bx7();
            }
            this.A0N = igShowreelNativeAnimationIntf;
            Boolean bool = this.A0U;
            if (bool != null) {
                A67 = bool.booleanValue();
            } else {
                A67 = c38321qM.A67();
            }
            this.A0U = Boolean.valueOf(A67);
            List list3 = this.A0n;
            if (list3 == null) {
                list3 = c38321qM.A0C.AmB();
            }
            this.A0n = list3;
            EnumC40111tc enumC40111tc = this.A0M;
            if (enumC40111tc == null) {
                enumC40111tc = c38321qM.BRp();
            }
            this.A0M = enumC40111tc;
            if (enumC40111tc == EnumC40111tc.A09 && this.A05 == null) {
                this.A05 = AbstractC87873vv.A00;
            }
            C4o9 c4o9 = this.A0P;
            if (c4o9 == null) {
                InterfaceC39541sb injected6 = c38321qM.A0C.getInjected();
                if (injected6 != null) {
                    c4o9 = injected6.Bm0();
                } else {
                    c4o9 = null;
                }
            }
            this.A0P = c4o9;
            InterfaceC104954oA interfaceC104954oA = this.A0Q;
            if (interfaceC104954oA == null) {
                InterfaceC39541sb injected7 = c38321qM.A0C.getInjected();
                if (injected7 != null) {
                    interfaceC104954oA = injected7.Bm1();
                } else {
                    interfaceC104954oA = null;
                }
            }
            this.A0Q = interfaceC104954oA;
            InterfaceC104914o3 interfaceC104914o3 = this.A0D;
            if (interfaceC104914o3 == null) {
                InterfaceC39541sb injected8 = c38321qM.A0C.getInjected();
                if (injected8 != null) {
                    interfaceC104914o3 = injected8.BMq();
                } else {
                    interfaceC104914o3 = null;
                }
            }
            this.A0D = interfaceC104914o3;
            AdFormatType adFormatType = this.A01;
            if (adFormatType == null) {
                InterfaceC39541sb injected9 = c38321qM.A0C.getInjected();
                if (injected9 != null) {
                    adFormatType = injected9.B82();
                } else {
                    adFormatType = null;
                }
            }
            this.A01 = adFormatType;
            return;
        }
        throw new IllegalStateException("Media must be non-null");
    }
}
