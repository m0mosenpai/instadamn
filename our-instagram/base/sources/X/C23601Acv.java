package X;

import android.graphics.Bitmap;
import android.view.View;
import com.instagram.archive.fragment.ArchiveReelCalendarFragment;
import com.instagram.model.reels.Reel;
import java.util.List;

/* renamed from: X.Acv, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23601Acv implements C1NJ {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C23601Acv(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A02 = obj3;
        this.A03 = obj2;
        this.A01 = obj;
    }

    @Override // X.C1NJ
    public final void Cza(InterfaceC59502nt interfaceC59502nt, C73033Pe c73033Pe) {
        Bitmap bitmap;
        switch (this.A00) {
            case 0:
                ArchiveReelCalendarFragment archiveReelCalendarFragment = (ArchiveReelCalendarFragment) this.A01;
                archiveReelCalendarFragment.A0E.remove(this);
                if (!ArchiveReelCalendarFragment.A05(archiveReelCalendarFragment)) {
                    return;
                }
                ArchiveReelCalendarFragment.A01((C51378Mmd) this.A02, archiveReelCalendarFragment, (Reel) this.A03);
                return;
            case 1:
                Bitmap A0O = AbstractC166997dE.A0O(c73033Pe);
                if (A0O == null) {
                    AbstractC166987dD.A1Y(this.A01);
                    return;
                } else {
                    A0U.A00(A0O, (InterfaceC16820sZ) this.A01, (InterfaceC16660sJ) this.A02, ((C148286ly) this.A03).A0H.getUrl().hashCode());
                    return;
                }
            case 2:
                Bitmap bitmap2 = c73033Pe.A01;
                if (bitmap2 == null) {
                    return;
                }
                A7H a7h = (A7H) this.A03;
                C7LE c7le = (C7LE) this.A02;
                XAY ALo = ((BC5) this.A01).ALo(bitmap2);
                if (ALo == null) {
                    return;
                }
                for (int i = 0; i < a7h.A00; i++) {
                    A7G a7g = new A7G(ALo, a7h.A01);
                    List list = c7le.A09;
                    list.add(a7g);
                    if (list.size() == 1) {
                        long j = c7le.A00;
                        if (j > 0) {
                            c7le.A01 = Math.max(c7le.A01, j);
                        } else {
                            c7le.A01 = 0L;
                            C9IR.A01.A00(c7le.A06);
                        }
                    }
                }
                return;
            default:
                AbstractC167017dG.A1N(interfaceC59502nt, c73033Pe);
                if (C14360o3.A0K(interfaceC59502nt.C4x(), this.A03) && (bitmap = c73033Pe.A01) != null) {
                    A19.A00(bitmap, (View) this.A01);
                    return;
                }
                return;
        }
    }

    @Override // X.C1NJ
    public final void DLP(InterfaceC59502nt interfaceC59502nt, C82183lf c82183lf) {
        switch (this.A00) {
            case 0:
                ArchiveReelCalendarFragment archiveReelCalendarFragment = (ArchiveReelCalendarFragment) this.A01;
                archiveReelCalendarFragment.A0E.remove(this);
                if (!ArchiveReelCalendarFragment.A05(archiveReelCalendarFragment)) {
                    return;
                }
                ArchiveReelCalendarFragment.A01((C51378Mmd) this.A02, archiveReelCalendarFragment, (Reel) this.A03);
                return;
            case 1:
            case 2:
            default:
                return;
            case 3:
                C14360o3.A0B(interfaceC59502nt, 0);
                ((InterfaceC16660sJ) this.A02).invoke(interfaceC59502nt);
                return;
        }
    }

    @Override // X.C1NJ
    public final void DLW(InterfaceC59502nt interfaceC59502nt, int i) {
    }
}
