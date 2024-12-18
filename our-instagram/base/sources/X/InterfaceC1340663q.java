package X;

import android.content.Intent;
import com.google.android.gms.common.internal.IAccountAccessor;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: X.63q, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC1340663q extends InterfaceC1340863s {
    void AJQ(C64A c64a);

    void APc(String str);

    void BmV(IAccountAccessor iAccountAccessor, java.util.Set set);

    Intent BxD();

    boolean CRe();

    boolean E6l();

    void disconnect();

    void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    int getMinApkVersion();

    boolean isConnected();

    boolean requiresSignIn();
}
