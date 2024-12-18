package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.IJd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41138IJd {
    public final Fragment A00;
    public final AbstractC018607g A01;
    public final InterfaceC11380iw A02;
    public final UserSession A03;
    public final C39702HjY A04;
    public final AtomicInteger A05 = new AtomicInteger();

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, X.HjY] */
    public C41138IJd(Fragment fragment, AbstractC018607g abstractC018607g, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        this.A00 = fragment;
        this.A03 = userSession;
        this.A01 = abstractC018607g;
        this.A02 = interfaceC11380iw;
        Context requireContext = fragment.requireContext();
        String moduleName = interfaceC11380iw.getModuleName();
        ?? obj = new Object();
        obj.A00 = requireContext;
        obj.A01 = userSession;
        obj.A02 = moduleName;
        this.A04 = obj;
    }
}
