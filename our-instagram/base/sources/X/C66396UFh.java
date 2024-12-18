package X;

import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

/* renamed from: X.UFh, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66396UFh extends VCM {
    public final android.net.Uri A00;
    public final ImmutableList A01;

    public C66396UFh(android.net.Uri uri, String str, List list) {
        super(str, null, 1, false);
        this.A00 = uri;
        this.A01 = ImmutableList.copyOf((Collection) list);
    }
}
