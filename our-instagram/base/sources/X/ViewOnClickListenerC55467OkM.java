package X;

import android.view.View;
import com.instagram.archive.fragment.ArchiveHomeFragment;
import com.instagram.archive.fragment.ArchiveReelFragment;

/* renamed from: X.OkM, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnClickListenerC55467OkM implements View.OnClickListener {
    public final int A00;
    public final Object A01;

    public ViewOnClickListenerC55467OkM(ArchiveHomeFragment archiveHomeFragment, int i) {
        this.A00 = i;
        switch (i) {
            case 3:
            case 4:
            case 5:
            case 6:
                this.A01 = archiveHomeFragment;
                return;
            default:
                this.A01 = archiveHomeFragment;
                return;
        }
    }

    public static void A00(View view, int i, Object obj) {
        C0fQ.A00(new ViewOnClickListenerC55467OkM(obj, i), view);
    }

    /* JADX WARN: Code restructure failed: missing block: B:287:0x0890, code lost:
    
        if (r2.equals(r1) == false) goto L267;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x014a, code lost:
    
        if (r1.A6F() != true) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0156, code lost:
    
        if (r1.A5g() != true) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0162, code lost:
    
        if (r1.A5P() != true) goto L48;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0793  */
    /* JADX WARN: Type inference failed for: r0v163, types: [X.Ost, java.lang.Object, X.1vN] */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r23) {
        /*
            Method dump skipped, instructions count: 4194
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnClickListenerC55467OkM.onClick(android.view.View):void");
    }

    public ViewOnClickListenerC55467OkM(ArchiveReelFragment archiveReelFragment, int i) {
        this.A00 = i;
        if (i != 0) {
            this.A01 = archiveReelFragment;
        } else {
            this.A01 = archiveReelFragment;
        }
    }

    public ViewOnClickListenerC55467OkM(C55173Odc c55173Odc, int i) {
        this.A00 = i;
        this.A01 = c55173Odc;
    }

    public ViewOnClickListenerC55467OkM(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
