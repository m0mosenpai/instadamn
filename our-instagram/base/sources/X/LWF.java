package X;

import com.instagram.ui.widget.mediapicker.Folder;

/* loaded from: classes8.dex */
public final class LWF implements InterfaceC28041Xi {
    public static final LWF A00 = new LWF();

    @Override // X.InterfaceC28041Xi
    public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
        int i;
        Folder folder = (Folder) obj;
        if (folder == null || (i = folder.A02) == -5 || i == -1 || (i != -10 && !folder.A05.isEmpty())) {
            return true;
        }
        return false;
    }
}
