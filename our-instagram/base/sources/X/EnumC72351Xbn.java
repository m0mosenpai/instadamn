package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Xbn, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class EnumC72351Xbn {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC72351Xbn[] A01;
    public static final EnumC72351Xbn A02;
    public static final EnumC72351Xbn A03;
    public static final EnumC72351Xbn A04;
    public static final EnumC72351Xbn A05;
    public static final EnumC72351Xbn A06;
    public static final EnumC72351Xbn A07;
    public static final EnumC72351Xbn A08;
    public static final EnumC72351Xbn A09;
    public static final EnumC72351Xbn A0A;
    public static final EnumC72351Xbn A0B;
    public static final EnumC72351Xbn A0C;
    public static final EnumC72351Xbn A0D;
    public static final EnumC72351Xbn A0E;
    public static final EnumC72351Xbn A0F;
    public static final EnumC72351Xbn A0G;
    public static final EnumC72351Xbn A0H;
    public static final EnumC72351Xbn A0I;

    static {
        C72264XaK c72264XaK = new C72264XaK();
        A0C = c72264XaK;
        C72262XaI c72262XaI = new C72262XaI();
        A0A = c72262XaI;
        C72261XaH c72261XaH = new C72261XaH();
        A09 = c72261XaH;
        C72260XaG c72260XaG = new C72260XaG();
        A08 = c72260XaG;
        C72256XaC c72256XaC = new C72256XaC();
        A04 = c72256XaC;
        C72254XaA c72254XaA = new C72254XaA();
        A02 = c72254XaA;
        C72270XaQ c72270XaQ = new C72270XaQ();
        A0I = c72270XaQ;
        C72263XaJ c72263XaJ = new C72263XaJ();
        A0B = c72263XaJ;
        C72258XaE c72258XaE = new C72258XaE();
        A06 = c72258XaE;
        C72257XaD c72257XaD = new C72257XaD();
        A05 = c72257XaD;
        C72259XaF c72259XaF = new C72259XaF();
        A07 = c72259XaF;
        C72267XaN c72267XaN = new C72267XaN();
        A0F = c72267XaN;
        C72268XaO c72268XaO = new C72268XaO();
        A0G = c72268XaO;
        C72265XaL c72265XaL = new C72265XaL();
        A0D = c72265XaL;
        C72266XaM c72266XaM = new C72266XaM();
        A0E = c72266XaM;
        EnumC72351Xbn enumC72351Xbn = new EnumC72351Xbn() { // from class: X.XaB
        };
        A03 = enumC72351Xbn;
        C72269XaP c72269XaP = new C72269XaP();
        A0H = c72269XaP;
        EnumC72351Xbn[] enumC72351XbnArr = {c72264XaK, c72262XaI, c72261XaH, c72260XaG, c72256XaC, c72254XaA, c72270XaQ, c72263XaJ, c72258XaE, c72257XaD, c72259XaF, c72267XaN, c72268XaO, c72265XaL, c72266XaM, enumC72351Xbn, c72269XaP};
        A01 = enumC72351XbnArr;
        A00 = AbstractC12190kN.A00(enumC72351XbnArr);
    }

    public final void A01(C31F c31f, C1PZ c1pz, Object obj) {
        if (this instanceof C72260XaG) {
            AbstractC167007dF.A1D(c31f, 0, c1pz);
            c31f.CiA(c1pz, null, obj, "ad_position_out_of_bound", null, null, null, AbstractC166987dD.A1J("insertion_position_larger_than_tray_size"), AbstractC166987dD.A1J("ad_position_out_of_bound"), null, null, false);
            return;
        }
        if (this instanceof C72257XaD) {
            AbstractC167007dF.A1D(c31f, 0, c1pz);
            ArrayList A1E = AbstractC166987dD.A1E();
            String A002 = AbstractC111324zv.A00(765);
            c31f.CiA(c1pz, null, obj, A002, null, null, null, A1E, AbstractC166987dD.A1J(A002), null, null, false);
            return;
        }
        if (this instanceof C72269XaP) {
            AbstractC167007dF.A1D(c31f, 0, c1pz);
            c31f.CiA(c1pz, null, obj, "eager_refresh_event", null, null, null, AbstractC166987dD.A1E(), AbstractC166987dD.A1J("eager_refresh_event"), null, null, false);
            return;
        }
        if (this instanceof C72254XaA) {
            AbstractC167007dF.A1D(c31f, 0, c1pz);
            c31f.CiA(c1pz, null, obj, "ad_position_is_passed", null, null, null, AbstractC166987dD.A1E(), AbstractC166987dD.A1J("ad_position_is_passed"), null, null, false);
            return;
        }
        if (this instanceof C72270XaQ) {
            AbstractC167007dF.A1D(c31f, 0, c1pz);
            ArrayList A1E2 = AbstractC166987dD.A1E();
            String A003 = AbstractC111324zv.A00(1326);
            c31f.CiA(c1pz, null, obj, A003, null, null, null, A1E2, AbstractC166987dD.A1J(A003), null, null, false);
            return;
        }
        if (this instanceof C72268XaO) {
            AbstractC167007dF.A1D(c31f, 0, c1pz);
            c31f.CiA(c1pz, null, obj, "replaced_slot_target_position_no_longer_valid_event", null, null, null, AbstractC166987dD.A1E(), AbstractC166987dD.A1J("replaced_slot_target_position_no_longer_valid_event"), null, null, false);
            return;
        }
        if (this instanceof C72267XaN) {
            AbstractC167007dF.A1D(c31f, 0, c1pz);
            ArrayList A1E3 = AbstractC166987dD.A1E();
            String A004 = AbstractC111324zv.A00(1231);
            c31f.CiA(c1pz, null, obj, A004, null, null, null, A1E3, AbstractC166987dD.A1J(A004), null, null, false);
            return;
        }
        if (this instanceof C72266XaM) {
            AbstractC167007dF.A1D(c31f, 0, c1pz);
            c31f.CiA(c1pz, null, obj, "profile_ad_host_profile_reel_placement_invalid", null, null, null, AbstractC166987dD.A1E(), AbstractC166987dD.A1J("profile_ad_host_profile_reel_placement_invalid"), null, null, false);
            return;
        }
        if (this instanceof C72265XaL) {
            AbstractC167007dF.A1D(c31f, 0, c1pz);
            c31f.CiA(c1pz, null, obj, "profile_ad_host_profile_feed_placement_invalid", null, null, null, AbstractC166987dD.A1E(), AbstractC166987dD.A1J("profile_ad_host_profile_feed_placement_invalid"), null, null, false);
            return;
        }
        if (this instanceof C72264XaK) {
            AbstractC167007dF.A1D(c31f, 0, c1pz);
            c31f.CiA(c1pz, null, obj, "ad_position_out_of_bound", null, null, null, AbstractC166987dD.A1E(), AbstractC166987dD.A1J("ad_position_out_of_bound"), null, null, false);
            return;
        }
        if (this instanceof C72263XaJ) {
            AbstractC167007dF.A1D(c31f, 0, c1pz);
            c31f.CiA(c1pz, null, obj, "overlay_ad_not_finding_hosting_organic_media", null, null, null, AbstractC166987dD.A1E(), AbstractC166987dD.A1J("overlay_ad_not_finding_hosting_organic_media"), null, null, false);
            return;
        }
        if (this instanceof C72262XaI) {
            AbstractC167007dF.A1D(c31f, 0, c1pz);
            c31f.CiA(c1pz, null, obj, "ad_position_out_of_bound", null, null, null, AbstractC166987dD.A1J("organic_sections_duplicated"), AbstractC166987dD.A1J("ad_position_out_of_bound"), null, null, false);
            return;
        }
        if (this instanceof C72261XaH) {
            AbstractC167007dF.A1D(c31f, 0, c1pz);
            c31f.CiA(c1pz, null, obj, "ad_position_out_of_bound", null, null, null, AbstractC166987dD.A1J("insertion_position_less_than_zero"), AbstractC166987dD.A1J("ad_position_out_of_bound"), null, null, false);
            return;
        }
        if (this instanceof C72259XaF) {
            AbstractC167007dF.A1D(c31f, 0, c1pz);
            c31f.CiA(c1pz, null, obj, "incompatible_content_blocklist", null, null, null, AbstractC166987dD.A1E(), AbstractC166987dD.A1J("incompatible_content_blocklist"), null, null, false);
        } else if (this instanceof C72258XaE) {
            AbstractC167007dF.A1D(c31f, 0, c1pz);
            c31f.CiA(c1pz, null, obj, "content_invalid", null, null, null, AbstractC166987dD.A1E(), AbstractC166987dD.A1J("content_invalid"), null, null, false);
        } else {
            if (this instanceof C72256XaC) {
                throw AbstractC166987dD.A1D("Background media hidden invalidation is not supported for ads.");
            }
            AbstractC167007dF.A1D(c31f, 0, c1pz);
            c31f.CiA(c1pz, null, obj, "afs_subscribed", null, null, null, AbstractC166987dD.A1J("afs_subscribed_invalidated_from_insertion"), AbstractC166987dD.A1J("afs_subscribed"), null, null, false);
        }
    }

    public final void A02(C31F c31f, Object obj) {
        if (this instanceof C72254XaA) {
            C14360o3.A0B(c31f, 0);
            A00(c31f, obj, "ad_position_is_passed");
            return;
        }
        if (this instanceof C72270XaQ) {
            C14360o3.A0B(c31f, 0);
            A00(c31f, obj, AbstractC111324zv.A00(1326));
            return;
        }
        if (this instanceof C72269XaP) {
            C14360o3.A0B(c31f, 0);
            A00(c31f, obj, "eager_refresh_event");
            return;
        }
        if (this instanceof C72268XaO) {
            C14360o3.A0B(c31f, 0);
            A00(c31f, obj, "replaced_slot_target_position_no_longer_valid_event");
            return;
        }
        if (this instanceof C72267XaN) {
            C14360o3.A0B(c31f, 0);
            A00(c31f, obj, AbstractC111324zv.A00(1231));
            return;
        }
        if (this instanceof C72266XaM) {
            C14360o3.A0B(c31f, 0);
            A00(c31f, obj, "profile_ad_host_profile_reel_placement_invalid");
            return;
        }
        if (this instanceof C72265XaL) {
            C14360o3.A0B(c31f, 0);
            A00(c31f, obj, "profile_ad_host_profile_feed_placement_invalid");
            return;
        }
        if (this instanceof C72264XaK) {
            C14360o3.A0B(c31f, 0);
            A00(c31f, obj, "ad_position_out_of_bound");
            return;
        }
        if (this instanceof C72263XaJ) {
            C14360o3.A0B(c31f, 0);
            A00(c31f, obj, "overlay_ad_not_finding_hosting_organic_media");
            return;
        }
        if (this instanceof C72262XaI) {
            C14360o3.A0B(c31f, 0);
            A00(c31f, obj, "ad_position_out_of_bound");
            return;
        }
        if (this instanceof C72261XaH) {
            C14360o3.A0B(c31f, 0);
            A00(c31f, obj, "ad_position_out_of_bound");
            return;
        }
        if (this instanceof C72260XaG) {
            C14360o3.A0B(c31f, 0);
            A00(c31f, obj, "ad_position_out_of_bound");
            return;
        }
        if (this instanceof C72259XaF) {
            C14360o3.A0B(c31f, 0);
            A00(c31f, obj, "incompatible_content_blocklist");
            return;
        }
        if (this instanceof C72258XaE) {
            C14360o3.A0B(c31f, 0);
            A00(c31f, obj, "content_invalid");
        } else if (this instanceof C72257XaD) {
            C14360o3.A0B(c31f, 0);
            A00(c31f, obj, AbstractC111324zv.A00(765));
        } else if (this instanceof C72256XaC) {
            C14360o3.A0B(c31f, 0);
            A00(c31f, obj, "background_media_hidden");
        } else {
            C14360o3.A0B(c31f, 0);
            A00(c31f, obj, "afs_subscribed");
        }
    }

    public static void A00(C31F c31f, Object obj, String str) {
        List singletonList = Collections.singletonList(str);
        C14360o3.A07(singletonList);
        c31f.Ckh(obj, str, singletonList);
    }

    public EnumC72351Xbn(String str, int i) {
    }
}
