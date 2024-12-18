package X;

import java.util.List;

/* renamed from: X.PSe, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC57039PSe implements Runnable {
    public final /* synthetic */ MUI A00;
    public final /* synthetic */ List A01;
    public final /* synthetic */ List A02;

    public RunnableC57039PSe(MUI mui, List list, List list2) {
        this.A00 = mui;
        this.A02 = list;
        this.A01 = list2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MUI mui = this.A00;
        C35223FgG.A02(mui.requireActivity(), (C19270xB) mui.A05.getValue(), mui.getSession(), "return_from_archive", "archive_share", this.A02, this.A01);
        mui.A00 = null;
    }
}
