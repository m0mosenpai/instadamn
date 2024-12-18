package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;

/* loaded from: classes5.dex */
public final class BZn extends C58J implements C5DZ, InterfaceC1129458d {
    public C29454CyU A00;
    public String A01;
    public InterfaceC1131459c A02;
    public Integer A03;
    public String A04;
    public final InterfaceC43457JHv A05;
    public final C4E5 A06;

    public BZn(InterfaceC43457JHv interfaceC43457JHv, C4E5 c4e5, Integer num, String str, String str2) {
        C14360o3.A0B(str, 1);
        this.A01 = str;
        this.A04 = str2;
        this.A03 = num;
        this.A06 = c4e5;
        this.A05 = interfaceC43457JHv;
    }

    @Override // X.C5DZ
    public final void DYp(InterfaceC1131459c interfaceC1131459c) {
        C14360o3.A0B(interfaceC1131459c, 0);
        if (interfaceC1131459c != this.A02) {
            this.A02 = interfaceC1131459c;
            A00();
        }
    }

    @Override // X.C5DZ
    public final /* synthetic */ void Def(long j) {
    }

    private final void A00() {
        String str;
        JI7 c29452CyS;
        String str2;
        C5UP c5up = AbstractC28345Cf3.A00;
        CQC cqc = (CQC) C5Zy.A00(c5up, this);
        if (cqc != null) {
            String str3 = this.A01;
            C14360o3.A0B(str3, 0);
            cqc.A00.A01(str3, null);
        }
        this.A00 = null;
        InterfaceC1131459c interfaceC1131459c = this.A02;
        if (interfaceC1131459c != null) {
            C29454CyU c29454CyU = new C29454CyU(interfaceC1131459c);
            this.A00 = c29454CyU;
            String moduleName = ((InterfaceC11380iw) C5Zy.A00(C5VZ.A00, this)).getModuleName();
            String str4 = this.A04;
            if (str4 == null) {
                switch (this.A03.intValue()) {
                    case 1:
                        str2 = "feed_netego";
                        break;
                    case 2:
                        str2 = AbstractC111324zv.A00(2364);
                        break;
                    case 3:
                        str2 = AbstractC111324zv.A00(2365);
                        break;
                    case 4:
                        str2 = "feed_video";
                        break;
                    case 5:
                        str2 = "feed_comment";
                        break;
                    case 6:
                        str2 = "feed_hscroll_ad";
                        break;
                    case 7:
                        str2 = AbstractC111324zv.A00(410);
                        break;
                    case 8:
                        str2 = AbstractC111324zv.A00(2358);
                        break;
                    case 9:
                        str2 = "ad_story";
                        break;
                    case 10:
                        str2 = "story";
                        break;
                    case 11:
                        str2 = "story_ads";
                        break;
                    case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                        str2 = "story_comment";
                        break;
                    case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                        str2 = "story_netego";
                        break;
                    case 14:
                        str2 = "explore";
                        break;
                    case Process.SIGTERM /* 15 */:
                        str2 = "explore_grid";
                        break;
                    case 16:
                        str2 = "search_grid";
                        break;
                    case 17:
                        str2 = "reels_ads";
                        break;
                    case 18:
                        str2 = "reels_netego";
                        break;
                    case Process.SIGSTOP /* 19 */:
                        str2 = AbstractC111324zv.A00(1220);
                        break;
                    case 20:
                        str2 = AbstractC111324zv.A00(1221);
                        break;
                    case 21:
                        str2 = "updates_hub";
                        break;
                    case 22:
                        str2 = "bcn_text_feed";
                        break;
                    default:
                        str2 = "feed";
                        break;
                }
                c29452CyS = new C29451CyR(this.A06, c29454CyU, str2, moduleName, this.A01);
            } else {
                C4E5 c4e5 = this.A06;
                switch (this.A03.intValue()) {
                    case 1:
                        str = "feed_netego";
                        break;
                    case 2:
                        str = AbstractC111324zv.A00(2364);
                        break;
                    case 3:
                        str = AbstractC111324zv.A00(2365);
                        break;
                    case 4:
                        str = "feed_video";
                        break;
                    case 5:
                        str = "feed_comment";
                        break;
                    case 6:
                        str = "feed_hscroll_ad";
                        break;
                    case 7:
                        str = AbstractC111324zv.A00(410);
                        break;
                    case 8:
                        str = AbstractC111324zv.A00(2358);
                        break;
                    case 9:
                        str = "ad_story";
                        break;
                    case 10:
                        str = "story";
                        break;
                    case 11:
                        str = "story_ads";
                        break;
                    case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                        str = "story_comment";
                        break;
                    case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                        str = "story_netego";
                        break;
                    case 14:
                        str = "explore";
                        break;
                    case Process.SIGTERM /* 15 */:
                        str = "explore_grid";
                        break;
                    case 16:
                        str = "search_grid";
                        break;
                    case 17:
                        str = "reels_ads";
                        break;
                    case 18:
                        str = "reels_netego";
                        break;
                    case Process.SIGSTOP /* 19 */:
                        str = AbstractC111324zv.A00(1220);
                        break;
                    case 20:
                        str = AbstractC111324zv.A00(1221);
                        break;
                    case 21:
                        str = "updates_hub";
                        break;
                    case 22:
                        str = "bcn_text_feed";
                        break;
                    default:
                        str = "feed";
                        break;
                }
                c29452CyS = new C29452CyS(c4e5, c29454CyU, str, moduleName, this.A01, str4);
            }
            JI7 ji7 = c29452CyS;
            CQC cqc2 = (CQC) C5Zy.A00(c5up, this);
            if (cqc2 != null) {
                InterfaceC43457JHv interfaceC43457JHv = this.A05;
                C14360o3.A0B(interfaceC43457JHv, 1);
                cqc2.A00.A00(null, interfaceC43457JHv, ji7);
            }
        }
    }

    @Override // X.C58J
    public final void A0E() {
        CQC cqc = (CQC) C5Zy.A00(AbstractC28345Cf3.A00, this);
        if (cqc != null) {
            String str = this.A01;
            C14360o3.A0B(str, 0);
            cqc.A00.A01(str, null);
        }
        this.A00 = null;
        this.A02 = null;
    }

    public final void A0F(String str, Integer num, String str2) {
        AbstractC167017dG.A1O(str, num);
        if (!C14360o3.A0K(this.A01, str) || !C14360o3.A0K(this.A04, str2) || this.A03 != num) {
            this.A01 = str;
            this.A04 = str2;
            this.A03 = num;
            A00();
        }
    }
}
