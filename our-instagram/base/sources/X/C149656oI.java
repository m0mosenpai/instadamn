package X;

import com.instagram.avatars.store.AvatarStore;
import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6oI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C149656oI {
    public final C149666oJ A00;
    public final AvatarStore A01;
    public final UserSession A02;

    public static final boolean A00(C149656oI c149656oI) {
        long j = c149656oI.A00.A00.A00.getLong("key_last_avatar_convergence_launch_upsells_limit_reached_timestamp", 0L);
        if (j != 0 && TimeUnit.MILLISECONDS.toDays(System.currentTimeMillis() - j) < 7) {
            return true;
        }
        return false;
    }

    public static final boolean A01(AvatarStore avatarStore) {
        C126475ni c126475ni;
        AbstractC439521d abstractC439521d = avatarStore.A01;
        if ((abstractC439521d instanceof C126475ni) && (c126475ni = (C126475ni) abstractC439521d) != null && c126475ni.A00.A04) {
            return true;
        }
        return false;
    }

    public static final boolean A02(AvatarStore avatarStore) {
        C126475ni c126475ni;
        AbstractC439521d abstractC439521d = avatarStore.A01;
        Integer num = null;
        if ((abstractC439521d instanceof C126475ni) && (c126475ni = (C126475ni) abstractC439521d) != null) {
            num = c126475ni.A00.A00;
        }
        if (num != C05F.A0C) {
            return false;
        }
        return true;
    }

    public final EnumC46145Kbj A03() {
        AvatarStore avatarStore = this.A01;
        if (A02(avatarStore) && A01(avatarStore) && AbstractC148716mg.A00(this.A02)) {
            return EnumC46145Kbj.A02;
        }
        return EnumC46145Kbj.A03;
    }

    public final boolean A04() {
        AvatarStore avatarStore = this.A01;
        if (!A02(avatarStore) && AbstractC148716mg.A00(this.A02) && A01(avatarStore) && !this.A00.A00.A00.getBoolean("key_has_seen_any_avatar_convergence_auto_migration_upsell", false)) {
            return true;
        }
        return false;
    }

    public final boolean A05() {
        AvatarStore avatarStore = this.A01;
        if ((avatarStore.A01 instanceof C126475ni) && !A02(avatarStore)) {
            UserSession userSession = this.A02;
            if (!AbstractC148716mg.A00(userSession) && !this.A00.A00.A00.getBoolean("key_has_seen_avatar_convergence_upsell_in_identity_sheet", false) && !A00(this)) {
                C14360o3.A0B(userSession, 0);
                if (C18U.A06(C06090Tz.A05, userSession, 36325278611944410L)) {
                    return true;
                }
            }
        }
        return false;
    }

    public /* synthetic */ C149656oI(UserSession userSession) {
        this(new C149666oJ(C21B.A00(userSession)), C20Y.A00(userSession), userSession);
    }

    public C149656oI(C149666oJ c149666oJ, AvatarStore avatarStore, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(avatarStore, 3);
        this.A02 = userSession;
        this.A00 = c149666oJ;
        this.A01 = avatarStore;
    }

    public C149656oI() {
    }
}
