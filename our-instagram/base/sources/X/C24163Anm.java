package X;

import com.instagram.ui.widget.mediapicker.Folder;
import java.util.List;

/* renamed from: X.Anm, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24163Anm implements InterfaceC189018Yr {
    public final /* synthetic */ InterfaceC189018Yr A00;

    public C24163Anm(InterfaceC189018Yr interfaceC189018Yr) {
        this.A00 = interfaceC189018Yr;
    }

    @Override // X.InterfaceC189018Yr
    public final List C3y(Integer num) {
        return this.A00.C3y(num);
    }

    @Override // X.InterfaceC189018Yr
    public final void Dr0(List list) {
        this.A00.Dr0(list);
    }

    @Override // X.InterfaceC189018Yr
    public final boolean AFb(Folder folder, List list) {
        AbstractC167017dG.A1N(list, folder);
        return this.A00.AFb(folder, C15500q5.A02(list));
    }
}
