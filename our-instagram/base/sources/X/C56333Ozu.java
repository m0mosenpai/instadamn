package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.creation.fragment.AlbumEditFragment;
import com.instagram.music.common.model.AudioOverlayTrack;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Ozu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56333Ozu implements MR0 {
    public final /* synthetic */ AlbumEditFragment A00;
    public final /* synthetic */ C47Z A01;

    @Override // X.MR0
    public final void Ekn(C49519LuY c49519LuY, boolean z) {
        String str;
        C14360o3.A0B(c49519LuY, 0);
        AlbumEditFragment albumEditFragment = this.A00;
        View view = albumEditFragment.A03;
        boolean z2 = false;
        if (view != null) {
            view.setVisibility(0);
        }
        albumEditFragment.A0U = z;
        C05A c05a = AlbumEditFragment.A03(albumEditFragment).A0J;
        do {
        } while (!c05a.AIi(c05a.getValue(), new C50627MWo(c49519LuY, C05F.A0N)));
        if (this.A01.A1G == EnumC40111tc.A09) {
            z2 = true;
        }
        UserSession A0r = AbstractC166987dD.A0r(albumEditFragment.A0d);
        AnonymousClass841 anonymousClass841 = albumEditFragment.A0H;
        if (anonymousClass841 == null) {
            str = "creationCameraSession";
        } else if (C36A.A0K(A0r, z2, anonymousClass841.CMB())) {
            C52254NAu c52254NAu = albumEditFragment.A0D;
            if (c52254NAu != null) {
                c52254NAu.A0G = true;
            }
            C50723MaO A03 = AlbumEditFragment.A03(albumEditFragment);
            InterfaceC189598ae interfaceC189598ae = albumEditFragment.A0Q;
            if (interfaceC189598ae == null) {
                str = "pendingMediaProvider";
            } else {
                A03.A04(interfaceC189598ae, true);
                return;
            }
        } else {
            return;
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public C56333Ozu(AlbumEditFragment albumEditFragment, C47Z c47z) {
        this.A00 = albumEditFragment;
        this.A01 = c47z;
    }

    @Override // X.MR0
    public final void DB1() {
        C52254NAu c52254NAu = this.A00.A0D;
        if (c52254NAu != null) {
            c52254NAu.onResume();
        }
    }

    @Override // X.MR0
    public final void DHD(AudioOverlayTrack audioOverlayTrack) {
        boolean z;
        AlbumEditFragment albumEditFragment = this.A00;
        C50723MaO A03 = AlbumEditFragment.A03(albumEditFragment);
        InterfaceC189598ae interfaceC189598ae = albumEditFragment.A0Q;
        if (interfaceC189598ae == null) {
            C14360o3.A0F("pendingMediaProvider");
            throw C00O.createAndThrow();
        }
        List A02 = A03.A02(interfaceC189598ae);
        if (!(A02 instanceof Collection) || !A02.isEmpty()) {
            Iterator it = A02.iterator();
            while (it.hasNext()) {
                if (AbstractC43592JPx.A0l(it).A5F) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        AlbumEditFragment.A0G(albumEditFragment, z, false);
        C52254NAu c52254NAu = albumEditFragment.A0D;
        if (c52254NAu != null) {
            c52254NAu.A0G = false;
        }
        AbstractC167007dF.A0x(albumEditFragment.A03);
    }

    @Override // X.MR0
    public final void DUF() {
        C8Z9 c8z9;
        AlbumEditFragment albumEditFragment = this.A00;
        C8Z9 c8z92 = albumEditFragment.A0I;
        if (c8z92 != null && c8z92.A05() && (c8z9 = albumEditFragment.A0I) != null) {
            c8z9.A04(false);
        }
        C18U.A06(C06090Tz.A05, AbstractC166987dD.A0r(albumEditFragment.A0d), 36326464022460303L);
    }

    @Override // X.MR0
    public final void E3n() {
        C52254NAu c52254NAu = this.A00.A0D;
        if (c52254NAu != null) {
            c52254NAu.onPause();
        }
    }
}
