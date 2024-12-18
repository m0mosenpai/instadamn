package X;

import java.util.regex.Pattern;

/* renamed from: X.2SG, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C2SG {
    public static final Pattern A01 = Pattern.compile("dump_([^_]*_[0-9]*)\\.(hprof|heapsnapshot).*");
    public static final Pattern A00 = Pattern.compile("(space_stats|maps)_([^_]+_[0-9]+)\\.txt");
}
