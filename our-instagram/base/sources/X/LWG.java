package X;

import com.instagram.ui.widget.mediapicker.Folder;

/* loaded from: classes8.dex */
public final class LWG implements InterfaceC28041Xi {
    public static final LWG A00 = new LWG();

    @Override // X.InterfaceC28041Xi
    public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
        Folder folder = (Folder) obj;
        if (folder == null || folder.A02 == -5 || folder.A05.isEmpty()) {
            return false;
        }
        return true;
    }
}
