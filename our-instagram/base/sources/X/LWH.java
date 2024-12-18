package X;

import com.instagram.ui.widget.mediapicker.Folder;

/* loaded from: classes8.dex */
public final class LWH implements InterfaceC28041Xi {
    public static final LWH A00 = new LWH();

    @Override // X.InterfaceC28041Xi
    public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
        Folder folder = (Folder) obj;
        if (folder != null) {
            if (folder.A02 != -5 && !folder.A05.isEmpty()) {
                return true;
            }
            return false;
        }
        throw AbstractC166997dE.A0g();
    }
}
