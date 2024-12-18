package X;

import com.instagram.ui.widget.mediapicker.Folder;

/* loaded from: classes8.dex */
public final class LWM implements InterfaceC28041Xi {
    public static final LWM A00 = new LWM();

    @Override // X.InterfaceC28041Xi
    public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
        Folder folder = (Folder) obj;
        C14360o3.A0A(folder);
        if (folder.A02 != -5 && !folder.A05.isEmpty()) {
            return true;
        }
        return false;
    }
}
