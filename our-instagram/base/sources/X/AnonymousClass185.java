package X;

import com.instagram.api.schemas.FanClubInfoDict;
import com.instagram.api.schemas.FanClubInfoDictImpl;
import com.instagram.api.schemas.ReelAutoArchiveSettingStr;
import com.instagram.user.model.User;

/* renamed from: X.185, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class AnonymousClass185 {
    /* JADX WARN: Type inference failed for: r1v0, types: [X.16X, java.lang.Object] */
    public static final C16X A00(User user) {
        boolean z;
        C223216l c223216l;
        boolean z2;
        C5F5 c5f5;
        boolean z3;
        boolean z4;
        C223616r c223616r;
        C224016y c224016y;
        boolean z5;
        int i;
        boolean z6;
        boolean z7;
        C109974xR c109974xR;
        C5F3 c5f3;
        ?? obj = new Object();
        obj.A0y = user.getId();
        obj.A17 = user.getUsername();
        obj.A0x = user.A03.getFullName();
        if (user.A0N() != null) {
            obj.A0r = user.A0N();
        }
        obj.A0N = Boolean.valueOf(user.CQf());
        obj.A0O = Boolean.valueOf(user.A1t());
        obj.A0u = user.A03.getExternalUrl();
        obj.A0i = user.A03.B7S();
        obj.A0j = user.A03.B7X();
        obj.A0w = user.B7L().toString();
        FanClubInfoDictImpl fanClubInfoDictImpl = null;
        obj.A0z = user.A0F().toString();
        obj.A0l = user.A03.BQb();
        obj.A12 = AnonymousClass186.A00(user.A0M());
        obj.A0A = user.Bhu();
        obj.A13 = user.A03.getProfilePicId();
        obj.A0B = user.A0D();
        obj.A0I = user.A03.BB5();
        obj.A0J = Boolean.valueOf(user.A1m());
        obj.A0c = Boolean.valueOf(user.isVerified());
        obj.A0b = Boolean.valueOf(user.A1h());
        obj.A0H = Boolean.valueOf(user.A1M());
        obj.A0E = Boolean.valueOf(user.A1J());
        if (user.A03.AkO() != null) {
            obj.A0F = Boolean.valueOf(user.A1L());
        }
        Boolean AkG = user.A03.AkG();
        if (AkG != null) {
            z = AkG.booleanValue();
        } else {
            z = false;
        }
        obj.A0D = Boolean.valueOf(z);
        obj.A0P = Boolean.valueOf(user.CQw());
        obj.A10 = user.A03.Baz();
        obj.A11 = user.A03.Bb3();
        obj.A0h = user.A03.Afv();
        if (user.A03.BlR() != ReelAutoArchiveSettingStr.A07) {
            obj.A05 = user.A03.BlR();
        }
        InterfaceC223316m BW9 = user.A03.BW9();
        if (BW9 != null) {
            c223216l = BW9.EzP();
        } else {
            c223216l = null;
        }
        obj.A07 = c223216l;
        Boolean AkS = user.A03.AkS();
        if (AkS != null) {
            z2 = AkS.booleanValue();
        } else {
            z2 = false;
        }
        obj.A0G = Boolean.valueOf(z2);
        obj.A08 = user.A03.Bul();
        obj.A0t = user.A03.AuI();
        obj.A0U = Boolean.valueOf(user.A2B());
        obj.A15 = user.A03.BrE();
        obj.A16 = user.A03.BrH();
        obj.A14 = user.A03.BrC();
        obj.A0n = user.A03.BrD();
        obj.A0Q = user.A03.CR7();
        if (obj.A03 != null) {
            C5F4 CR8 = user.A03.CR8();
            if (CR8 != null) {
                c5f3 = CR8.Evm();
            } else {
                c5f3 = null;
            }
            obj.A03 = c5f3;
        }
        obj.A0v = user.A03.B4t();
        C5F6 B4r = user.A03.B4r();
        if (B4r != null) {
            c5f5 = B4r.EtL();
        } else {
            c5f5 = null;
        }
        obj.A01 = c5f5;
        obj.A0C = user.A0I();
        obj.A0q = user.BTC();
        obj.A0k = Integer.valueOf(user.BJ8());
        Boolean CUD = user.A03.CUD();
        if (CUD != null) {
            z3 = CUD.booleanValue();
        } else {
            z3 = false;
        }
        obj.A0R = Boolean.valueOf(z3);
        obj.A0V = user.A03.CX0();
        obj.A0W = user.A03.CYP();
        obj.A06 = user.A0A();
        obj.A0s = user.A03.ArO();
        obj.A0d = user.A03.CH9();
        obj.A0g = Integer.valueOf(user.A00());
        obj.A0m = Integer.valueOf(user.A04());
        obj.A0T = user.A03.CVe();
        obj.A0Y = Boolean.valueOf(user.A2E());
        obj.A0Z = user.A03.CZ8();
        Boolean CZ9 = user.A03.CZ9();
        if (CZ9 != null) {
            z4 = CZ9.booleanValue();
        } else {
            z4 = false;
        }
        obj.A0a = Boolean.valueOf(z4);
        obj.A0L = user.A03.CQ2();
        InterfaceC223716s C45 = user.A03.C45();
        if (C45 != null) {
            c223616r = C45.F2e();
        } else {
            c223616r = null;
        }
        obj.A09 = c223616r;
        obj.A0S = Boolean.valueOf(user.A27());
        FanClubInfoDict B4O = user.A03.B4O();
        if (B4O != null) {
            fanClubInfoDictImpl = B4O.EtQ();
        }
        obj.A02 = fanClubInfoDictImpl;
        InterfaceC224116z Asx = user.A03.Asx();
        if (Asx != null) {
            c224016y = Asx.Esk();
        } else {
            c224016y = null;
        }
        obj.A00 = c224016y;
        Boolean CeX = user.A03.CeX();
        if (CeX != null) {
            z5 = CeX.booleanValue();
        } else {
            z5 = false;
        }
        obj.A0M = Boolean.valueOf(z5);
        obj.A0K = Boolean.valueOf(user.A1o());
        Integer C6d = user.A03.C6d();
        if (C6d != null) {
            i = C6d.intValue();
        } else {
            i = 0;
        }
        obj.A0p = Integer.valueOf(i);
        Boolean C6W = user.A03.C6W();
        if (C6W != null) {
            z6 = C6W.booleanValue();
        } else {
            z6 = false;
        }
        obj.A0f = Boolean.valueOf(z6);
        obj.A0o = user.A03.C6R();
        Boolean C64 = user.A03.C64();
        if (C64 != null) {
            z7 = C64.booleanValue();
        } else {
            z7 = false;
        }
        obj.A0e = Boolean.valueOf(z7);
        obj.A0X = Boolean.valueOf(user.A1U());
        InterfaceC109984xS BYy = user.A03.BYy();
        if (BYy != null) {
            c109974xR = BYy.ExW();
        } else {
            c109974xR = null;
        }
        obj.A04 = c109974xR;
        return obj;
    }
}
