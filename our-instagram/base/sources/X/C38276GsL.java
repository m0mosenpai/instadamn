package X;

import com.google.common.collect.ImmutableMap;

/* renamed from: X.GsL, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38276GsL implements InterfaceC41501vz {
    public final /* synthetic */ C72743Nv A00;

    public C38276GsL(C72743Nv c72743Nv) {
        this.A00 = c72743Nv;
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = C0f9.A03(-452158979);
        int A032 = C0f9.A03(-765882219);
        C72743Nv c72743Nv = this.A00;
        ImmutableMap immutableMap = C72743Nv.A0U;
        if (c72743Nv.A0D != null) {
            c72743Nv.requireContext();
            throw AbstractC166987dD.A15("getArchivePendingUpload");
        }
        C0f9.A0A(-104369464, A032);
        C0f9.A0A(-685117829, A03);
    }
}
