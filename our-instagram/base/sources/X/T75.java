package X;

/* loaded from: classes10.dex */
public final /* synthetic */ class T75 implements InterfaceC65424Tjv {
    public static final /* synthetic */ T75 A00 = new Object();

    @Override // X.InterfaceC65424Tjv
    public final void onFailure(Exception exc) {
        C62442SBv c62442SBv = THY.A05;
        String str = "Error preloading model resource";
        if (android.util.Log.isLoggable("MobileVisionBase", 6)) {
            String str2 = c62442SBv.A00;
            if (str2 != null) {
                str = str2.concat("Error preloading model resource");
            }
            android.util.Log.e("MobileVisionBase", str, exc);
        }
    }
}
