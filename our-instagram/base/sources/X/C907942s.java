package X;

import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

/* renamed from: X.42s, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C907942s extends Exception {
    public final ImmutableList A00;

    public C907942s(String str, List list) {
        super(str);
        this.A00 = ImmutableList.copyOf((Collection) list);
    }
}
