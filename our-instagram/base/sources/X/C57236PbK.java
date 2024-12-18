package X;

import android.os.Build;
import android.os.Bundle;
import java.io.Serializable;

/* renamed from: X.PbK, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57236PbK extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ N6I A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57236PbK(N6I n6i) {
        super(0);
        this.A00 = n6i;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        int i = Build.VERSION.SDK_INT;
        Bundle requireArguments = this.A00.requireArguments();
        if (i >= 33) {
            return requireArguments.getSerializable("highlight_management_source", EnumC53243Ngg.class);
        }
        Serializable serializable = requireArguments.getSerializable("highlight_management_source");
        C14360o3.A0C(serializable, "null cannot be cast to non-null type com.instagram.archive.intf.ArchiveConstants.HighlightManagementSource");
        return serializable;
    }
}
