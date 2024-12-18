package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.DqT, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31364DqT {
    public static final C28421Zd A03() {
        C28421Zd c28421Zd = C28421Zd.A03;
        if (c28421Zd == null) {
            C14360o3.A0F("_instance");
            throw C00O.createAndThrow();
        }
        return c28421Zd;
    }

    public static Bundle A00(C31368DqX c31368DqX, InterfaceC09390do interfaceC09390do) {
        return A03().A01.A01((UserSession) interfaceC09390do.getValue(), c31368DqX.A03());
    }

    public static Fragment A01(UserSession userSession, C31368DqX c31368DqX) {
        return A03().A01.A02(userSession, c31368DqX.A03());
    }

    public static C28431Ze A02() {
        return A03().A01;
    }
}
