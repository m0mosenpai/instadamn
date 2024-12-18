package X;

/* renamed from: X.0BZ, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0BZ implements C0I3 {
    public int mMinimumLoggingLevel;

    public void d(String str, String str2) {
    }

    public void i(String str, String str2) {
    }

    public void v(String str, String str2) {
    }

    @Override // X.C0I3
    public abstract void wtf(String str, String str2);

    @Override // X.C0I3
    public abstract void wtf(String str, String str2, Throwable th);

    @Override // X.C0I3
    public int getMinimumLoggingLevel() {
        return this.mMinimumLoggingLevel;
    }

    @Override // X.C0I3
    public boolean isLoggable(int i) {
        if (this.mMinimumLoggingLevel > i) {
            return false;
        }
        return true;
    }

    @Override // X.C0I3
    public void setMinimumLoggingLevel(int i) {
        this.mMinimumLoggingLevel = i;
    }

    @Override // X.C0I3
    public void e(String str, String str2) {
        android.util.Log.e(str, str2);
    }

    @Override // X.C0I3
    public void w(String str, String str2) {
        android.util.Log.w(str, str2);
    }

    @Override // X.C0I3
    public void log(int i, String str, String str2) {
        android.util.Log.println(i, str, str2);
    }

    @Override // X.C0I3
    public void e(String str, String str2, Throwable th) {
        android.util.Log.e(str, str2, th);
    }

    @Override // X.C0I3
    public void w(String str, String str2, Throwable th) {
        android.util.Log.w(str, str2, th);
    }

    public void d(String str, String str2, Throwable th) {
    }

    public void i(String str, String str2, Throwable th) {
    }

    public void v(String str, String str2, Throwable th) {
    }
}
