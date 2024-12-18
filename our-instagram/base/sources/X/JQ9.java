package X;

import com.instagram.creation.drafts.model.datasource.clips.ClipsDraftLocalDataSource;

/* loaded from: classes8.dex */
public final class JQ9 implements InterfaceC19390xP {
    public final /* synthetic */ ClipsDraftLocalDataSource A00;
    public final /* synthetic */ InterfaceC19390xP A01;

    public JQ9(ClipsDraftLocalDataSource clipsDraftLocalDataSource, InterfaceC19390xP interfaceC19390xP) {
        this.A01 = interfaceC19390xP;
        this.A00 = clipsDraftLocalDataSource;
    }

    @Override // X.InterfaceC19390xP
    public final Object collect(InterfaceC19960yQ interfaceC19960yQ, InterfaceC23621Ds interfaceC23621Ds) {
        return AbstractC167017dG.A0i(interfaceC23621Ds, this.A01, new JWH(37, interfaceC19960yQ, this.A00));
    }
}
