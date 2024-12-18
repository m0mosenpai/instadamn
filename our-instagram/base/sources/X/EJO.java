package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.platform.ComposeView;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes6.dex */
public final class EJO extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "DirectManageFoldersCreateFolderFragment";
    public C34924FaA A00;
    public List A01;
    public final InterfaceC74953Yl A02;
    public final InterfaceC74953Yl A03;
    public final InterfaceC74953Yl A04;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A08;
    public final InterfaceC09390do A07 = AbstractC60492pY.A02(this);
    public final String A09 = "direct_manage_folders_edit";
    public final List A05 = AbstractC166987dD.A1E();

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.Efu(2131959807);
        AbstractC31176DnK.A1C(ViewOnClickListenerC35681FpG.A00(this, 58), AbstractC31176DnK.A0I(), interfaceC56362iU);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A07);
    }

    public EJO() {
        C74883Yd A00 = AbstractC74873Yc.A00();
        InterfaceC09390do interfaceC09390do = AbstractC74903Yf.A01;
        this.A03 = new ParcelableSnapshotMutableState(A00, "");
        this.A04 = new ParcelableSnapshotMutableState(AbstractC74873Yc.A00(), AbstractC166997dE.A0a());
        this.A02 = new ParcelableSnapshotMutableState(AbstractC74873Yc.A00(), C29183Cto.A00);
        this.A06 = AbstractC09440dt.A01(new C37014GSt(this, 19));
        this.A08 = AbstractC09440dt.A01(new C37014GSt(this, 22));
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A09;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        List A0g;
        int A02 = C0f9.A02(-2123441868);
        super.onCreate(bundle);
        InterfaceC09390do interfaceC09390do = this.A07;
        this.A00 = new C34924FaA(AbstractC166987dD.A0r(interfaceC09390do));
        C46922Dg c46922Dg = ((C2DU) AbstractC31180DnO.A0O(interfaceC09390do)).A0C;
        ReentrantReadWriteLock reentrantReadWriteLock = c46922Dg.A0G;
        if (c46922Dg.A0L) {
            ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
            readLock.lock();
            try {
                A0g = AbstractC001800i.A0g(c46922Dg.A00.A06(), new GRI(4));
            } finally {
                readLock.unlock();
            }
        } else {
            synchronized (c46922Dg.A0D) {
                A0g = AbstractC001800i.A0g(c46922Dg.A00.A06(), new GRI(4));
            }
        }
        ArrayList A0q = AbstractC167017dG.A0q(A0g);
        Iterator it = A0g.iterator();
        while (it.hasNext()) {
            A0q.add(((C50092Rx) it.next()).A02);
        }
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it2 = A0q.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (((String) next).length() > 0) {
                A1E.add(next);
            }
        }
        this.A01 = A1E;
        C34924FaA c34924FaA = this.A00;
        if (c34924FaA == null) {
            AbstractC31171DnF.A0s();
            throw C00O.createAndThrow();
        }
        Object value = this.A06.getValue();
        C14360o3.A0B(value, 0);
        C34924FaA.A00(c34924FaA, "inbox_folders_create_screen_impression", AbstractC167007dF.A0n(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, value));
        C0f9.A09(608826679, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1601518440);
        ComposeView A00 = AbstractC25319BIo.A00(this, new C30190DRv(this, 26), -781386006);
        C0f9.A09(402978832, A02);
        return A00;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-1092997320);
        super.onDestroy();
        AbstractC31176DnK.A0Q(this.A07).A04("MOVE_THREADS_TO_NEW_FOLDER_LISTENER_TAG");
        C0f9.A09(-1243278416, A02);
    }
}
