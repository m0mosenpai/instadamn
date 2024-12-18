package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.creation.fragment.AlbumEditFragment;
import com.instagram.creation.fragment.EditMediaInfoFragment;
import com.instagram.creation.fragment.ManageDraftsFragment;

/* loaded from: classes9.dex */
public final class OMV {
    public final AbstractC59962oe A00(UserSession userSession) {
        AbstractC59962oe manageDraftsFragment;
        if (C18U.A06(AbstractC25225BEi.A0j(userSession, 0), userSession, 36328139060690147L)) {
            manageDraftsFragment = new KBD();
        } else {
            manageDraftsFragment = new ManageDraftsFragment();
        }
        Bundle A05 = AbstractC31178DnM.A05(userSession);
        A05.putBoolean(AbstractC43591JPw.A00(1115), false);
        manageDraftsFragment.setArguments(A05);
        return manageDraftsFragment;
    }

    public final AlbumEditFragment A01(UserSession userSession, boolean z, boolean z2) {
        C14360o3.A0B(userSession, 0);
        AlbumEditFragment albumEditFragment = new AlbumEditFragment();
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putBoolean("standalone_mode", z);
        if (!C18U.A06(C06090Tz.A05, userSession, 2342166058737740683L)) {
            A0b.putBoolean("is_legacy_feed_creation", z2);
        }
        albumEditFragment.setArguments(A0b);
        return albumEditFragment;
    }

    public final C50724MaP A03(UserSession userSession, int i, boolean z, boolean z2) {
        C14360o3.A0B(userSession, 0);
        C50724MaP c50724MaP = new C50724MaP();
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putBoolean("standalone_mode", z);
        if (!C18U.A06(C06090Tz.A05, userSession, 2342166058737740683L)) {
            A0b.putBoolean("is_legacy_feed_creation", z2);
        }
        A0b.putSerializable("default_open_tool", EnumC53148Nf3.values()[i]);
        c50724MaP.setArguments(A0b);
        return c50724MaP;
    }

    public final EditMediaInfoFragment A02(String str, int i, int i2, int i3, boolean z) {
        EditMediaInfoFragment editMediaInfoFragment = new EditMediaInfoFragment();
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString("EditMediaFragment.ARGUMENT_MEDIA_ID", str);
        A0b.putInt("EditMediaFragment.ARGUMENT_MEDIA_TYPE", i);
        A0b.putInt("EditMediaFragment.ARGUMENT_MEDIA_CAROUSEL_INDEX", i2);
        A0b.putInt("EditMediaFragment.ARGUMENT_MEDIA_POSITION_IN_FEED", i3);
        A0b.putBoolean("EditMediaFragment.ARGUMENT_MEDIA_IS_CAROUSEL_BUMPED_POST", z);
        editMediaInfoFragment.setArguments(A0b);
        return editMediaInfoFragment;
    }

    public final C222419ri A04(Bundle bundle, C55U c55u) {
        String str = c55u.A02;
        C222419ri c222419ri = new C222419ri();
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putStringArrayList("UniversalCreationQuickCameraFragment.ARGUMENT_CAMERA_DESTINATION_LIST", MSX.A0m(str));
        A0b.putAll(bundle);
        c222419ri.setArguments(A0b);
        return c222419ri;
    }
}
