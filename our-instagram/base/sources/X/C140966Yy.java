package X;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import java.lang.ref.WeakReference;

/* renamed from: X.6Yy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C140966Yy {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public Fragment A05;
    public AbstractC10360h2 A06;
    public C53S A07;
    public C68939Ved A08;
    public InterfaceC11380iw A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public Bundle A0I;
    public InterfaceC53922dW A0J;
    public final AbstractC12990ll A0K;
    public final WeakReference A0L;

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005f, code lost:
    
        if ((r5 instanceof X.C2d8) != false) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C140966Yy(androidx.fragment.app.FragmentActivity r5, X.AbstractC12990ll r6) {
        /*
            r4 = this;
            r1 = 1
            X.C14360o3.A0B(r5, r1)
            r4.<init>()
            if (r6 == 0) goto L6a
            r4.A0K = r6
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r5)
            r4.A0L = r0
            r4.A0D = r1
            r3 = 2131435251(0x7f0b1ef3, float:1.8492339E38)
            r4.A02 = r3
            boolean r2 = r5 instanceof X.InterfaceC53772dG
            if (r2 == 0) goto L57
            r1 = r5
            X.2dG r1 = (X.InterfaceC53772dG) r1
            boolean r0 = r1.CYp()
            if (r0 == 0) goto L57
            X.2oN r0 = r1.BUF()
            if (r0 == 0) goto L57
            X.JX3 r0 = X.C59802oN.A01(r0)
            if (r0 == 0) goto L62
            X.0h2 r0 = r0.getChildFragmentManager()
            X.C14360o3.A07(r0)
            r4.A06 = r0
            r3 = 2131429916(0x7f0b0a1c, float:1.8481518E38)
        L3e:
            r4.A02 = r3
        L40:
            if (r2 == 0) goto L4a
            boolean r0 = r5 instanceof X.InterfaceC53922dW
            if (r0 == 0) goto L4a
            X.2dW r5 = (X.InterfaceC53922dW) r5
            r4.A0J = r5
        L4a:
            androidx.fragment.app.Fragment r1 = r4.A00()
            boolean r0 = r1 instanceof X.InterfaceC11380iw
            if (r0 == 0) goto L56
            X.0iw r1 = (X.InterfaceC11380iw) r1
            r4.A09 = r1
        L56:
            return
        L57:
            X.0h2 r0 = X.AbstractC62582sx.A00(r5)
            r4.A06 = r0
            boolean r0 = r5 instanceof X.C2d8
            if (r0 == 0) goto L40
            goto L3e
        L62:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L6a:
            java.lang.String r1 = "Session cannot be null for FragmentNavigator"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C140966Yy.<init>(androidx.fragment.app.FragmentActivity, X.0ll):void");
    }

    public final void A06() {
        A0G(null, 0);
    }

    public final void A08() {
        this.A0F = true;
    }

    public final void A0B(Bundle bundle, Fragment fragment) {
        C14360o3.A0B(fragment, 0);
        this.A05 = fragment;
        this.A0I = bundle;
    }

    public final void A0D(Fragment fragment) {
        A0B(null, fragment);
    }

    public final void A0E(Fragment fragment) {
        C14360o3.A0B(fragment, 0);
        A0B(null, fragment);
    }

    private final Fragment A00() {
        EnumC12410kj enumC12410kj;
        String str;
        String str2;
        WeakReference weakReference = this.A0L;
        if (weakReference.get() == null) {
            enumC12410kj = EnumC12410kj.A0A;
            str = "FragmentNavigator";
            str2 = "Activity reference is null when finding current fragment";
        } else {
            Activity activity = (Activity) weakReference.get();
            if (activity == null || activity.findViewById(this.A02) == null) {
                enumC12410kj = EnumC12410kj.A0A;
                str = "FragmentNavigator";
                str2 = "FragmentNavigator couldn't find fragment layout id";
            }
            return this.A06.A0O(this.A02);
        }
        A01(enumC12410kj, str, str2);
        return this.A06.A0O(this.A02);
    }

    private final void A01(EnumC12410kj enumC12410kj, String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(", in activity ");
        sb.append(this.A0L.get());
        sb.append(", with nav_events: ");
        C26771Rh A00 = C26771Rh.A00();
        C14360o3.A07(A00);
        String A01 = A00.A01();
        C14360o3.A07(A01);
        sb.append(A01);
        C0w9.A01(enumC12410kj, str, sb.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00bc A[Catch: all -> 0x0241, TryCatch #1 {all -> 0x0241, blocks: (B:5:0x0010, B:7:0x0016, B:9:0x0020, B:10:0x0031, B:12:0x0035, B:14:0x003b, B:16:0x003f, B:17:0x0122, B:18:0x0044, B:20:0x004c, B:21:0x0055, B:23:0x0060, B:25:0x0064, B:27:0x0068, B:29:0x006c, B:31:0x0070, B:33:0x0074, B:34:0x00cc, B:37:0x00ef, B:38:0x00dd, B:40:0x00e1, B:41:0x0080, B:43:0x0084, B:45:0x0094, B:47:0x009a, B:48:0x009f, B:50:0x00a3, B:51:0x00a8, B:53:0x00ac, B:54:0x00b1, B:56:0x00b5, B:58:0x012b, B:61:0x0145, B:63:0x014b, B:66:0x013a, B:69:0x021d, B:70:0x0220, B:73:0x0151, B:75:0x015e, B:77:0x0166, B:80:0x017c, B:82:0x0182, B:85:0x0171, B:89:0x0188, B:91:0x018c, B:93:0x0194, B:111:0x0206, B:113:0x020c, B:115:0x0214, B:125:0x00bc, B:126:0x00c2, B:128:0x00c6, B:129:0x008a, B:130:0x00e9, B:133:0x00f7, B:135:0x00fb, B:137:0x0105, B:139:0x0109, B:140:0x010e, B:142:0x0114, B:144:0x011d, B:145:0x011a, B:146:0x0101, B:147:0x022b, B:79:0x016c, B:95:0x019a, B:97:0x01a0, B:99:0x01a6, B:101:0x01ac, B:103:0x01b6, B:105:0x01c7, B:107:0x01f8, B:108:0x0200, B:110:0x0203, B:60:0x0131), top: B:4:0x0010, inners: #0, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00c2 A[Catch: all -> 0x0241, TryCatch #1 {all -> 0x0241, blocks: (B:5:0x0010, B:7:0x0016, B:9:0x0020, B:10:0x0031, B:12:0x0035, B:14:0x003b, B:16:0x003f, B:17:0x0122, B:18:0x0044, B:20:0x004c, B:21:0x0055, B:23:0x0060, B:25:0x0064, B:27:0x0068, B:29:0x006c, B:31:0x0070, B:33:0x0074, B:34:0x00cc, B:37:0x00ef, B:38:0x00dd, B:40:0x00e1, B:41:0x0080, B:43:0x0084, B:45:0x0094, B:47:0x009a, B:48:0x009f, B:50:0x00a3, B:51:0x00a8, B:53:0x00ac, B:54:0x00b1, B:56:0x00b5, B:58:0x012b, B:61:0x0145, B:63:0x014b, B:66:0x013a, B:69:0x021d, B:70:0x0220, B:73:0x0151, B:75:0x015e, B:77:0x0166, B:80:0x017c, B:82:0x0182, B:85:0x0171, B:89:0x0188, B:91:0x018c, B:93:0x0194, B:111:0x0206, B:113:0x020c, B:115:0x0214, B:125:0x00bc, B:126:0x00c2, B:128:0x00c6, B:129:0x008a, B:130:0x00e9, B:133:0x00f7, B:135:0x00fb, B:137:0x0105, B:139:0x0109, B:140:0x010e, B:142:0x0114, B:144:0x011d, B:145:0x011a, B:146:0x0101, B:147:0x022b, B:79:0x016c, B:95:0x019a, B:97:0x01a0, B:99:0x01a6, B:101:0x01ac, B:103:0x01b6, B:105:0x01c7, B:107:0x01f8, B:108:0x0200, B:110:0x0203, B:60:0x0131), top: B:4:0x0010, inners: #0, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009a A[Catch: all -> 0x0241, TryCatch #1 {all -> 0x0241, blocks: (B:5:0x0010, B:7:0x0016, B:9:0x0020, B:10:0x0031, B:12:0x0035, B:14:0x003b, B:16:0x003f, B:17:0x0122, B:18:0x0044, B:20:0x004c, B:21:0x0055, B:23:0x0060, B:25:0x0064, B:27:0x0068, B:29:0x006c, B:31:0x0070, B:33:0x0074, B:34:0x00cc, B:37:0x00ef, B:38:0x00dd, B:40:0x00e1, B:41:0x0080, B:43:0x0084, B:45:0x0094, B:47:0x009a, B:48:0x009f, B:50:0x00a3, B:51:0x00a8, B:53:0x00ac, B:54:0x00b1, B:56:0x00b5, B:58:0x012b, B:61:0x0145, B:63:0x014b, B:66:0x013a, B:69:0x021d, B:70:0x0220, B:73:0x0151, B:75:0x015e, B:77:0x0166, B:80:0x017c, B:82:0x0182, B:85:0x0171, B:89:0x0188, B:91:0x018c, B:93:0x0194, B:111:0x0206, B:113:0x020c, B:115:0x0214, B:125:0x00bc, B:126:0x00c2, B:128:0x00c6, B:129:0x008a, B:130:0x00e9, B:133:0x00f7, B:135:0x00fb, B:137:0x0105, B:139:0x0109, B:140:0x010e, B:142:0x0114, B:144:0x011d, B:145:0x011a, B:146:0x0101, B:147:0x022b, B:79:0x016c, B:95:0x019a, B:97:0x01a0, B:99:0x01a6, B:101:0x01ac, B:103:0x01b6, B:105:0x01c7, B:107:0x01f8, B:108:0x0200, B:110:0x0203, B:60:0x0131), top: B:4:0x0010, inners: #0, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a3 A[Catch: all -> 0x0241, TryCatch #1 {all -> 0x0241, blocks: (B:5:0x0010, B:7:0x0016, B:9:0x0020, B:10:0x0031, B:12:0x0035, B:14:0x003b, B:16:0x003f, B:17:0x0122, B:18:0x0044, B:20:0x004c, B:21:0x0055, B:23:0x0060, B:25:0x0064, B:27:0x0068, B:29:0x006c, B:31:0x0070, B:33:0x0074, B:34:0x00cc, B:37:0x00ef, B:38:0x00dd, B:40:0x00e1, B:41:0x0080, B:43:0x0084, B:45:0x0094, B:47:0x009a, B:48:0x009f, B:50:0x00a3, B:51:0x00a8, B:53:0x00ac, B:54:0x00b1, B:56:0x00b5, B:58:0x012b, B:61:0x0145, B:63:0x014b, B:66:0x013a, B:69:0x021d, B:70:0x0220, B:73:0x0151, B:75:0x015e, B:77:0x0166, B:80:0x017c, B:82:0x0182, B:85:0x0171, B:89:0x0188, B:91:0x018c, B:93:0x0194, B:111:0x0206, B:113:0x020c, B:115:0x0214, B:125:0x00bc, B:126:0x00c2, B:128:0x00c6, B:129:0x008a, B:130:0x00e9, B:133:0x00f7, B:135:0x00fb, B:137:0x0105, B:139:0x0109, B:140:0x010e, B:142:0x0114, B:144:0x011d, B:145:0x011a, B:146:0x0101, B:147:0x022b, B:79:0x016c, B:95:0x019a, B:97:0x01a0, B:99:0x01a6, B:101:0x01ac, B:103:0x01b6, B:105:0x01c7, B:107:0x01f8, B:108:0x0200, B:110:0x0203, B:60:0x0131), top: B:4:0x0010, inners: #0, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ac A[Catch: all -> 0x0241, TryCatch #1 {all -> 0x0241, blocks: (B:5:0x0010, B:7:0x0016, B:9:0x0020, B:10:0x0031, B:12:0x0035, B:14:0x003b, B:16:0x003f, B:17:0x0122, B:18:0x0044, B:20:0x004c, B:21:0x0055, B:23:0x0060, B:25:0x0064, B:27:0x0068, B:29:0x006c, B:31:0x0070, B:33:0x0074, B:34:0x00cc, B:37:0x00ef, B:38:0x00dd, B:40:0x00e1, B:41:0x0080, B:43:0x0084, B:45:0x0094, B:47:0x009a, B:48:0x009f, B:50:0x00a3, B:51:0x00a8, B:53:0x00ac, B:54:0x00b1, B:56:0x00b5, B:58:0x012b, B:61:0x0145, B:63:0x014b, B:66:0x013a, B:69:0x021d, B:70:0x0220, B:73:0x0151, B:75:0x015e, B:77:0x0166, B:80:0x017c, B:82:0x0182, B:85:0x0171, B:89:0x0188, B:91:0x018c, B:93:0x0194, B:111:0x0206, B:113:0x020c, B:115:0x0214, B:125:0x00bc, B:126:0x00c2, B:128:0x00c6, B:129:0x008a, B:130:0x00e9, B:133:0x00f7, B:135:0x00fb, B:137:0x0105, B:139:0x0109, B:140:0x010e, B:142:0x0114, B:144:0x011d, B:145:0x011a, B:146:0x0101, B:147:0x022b, B:79:0x016c, B:95:0x019a, B:97:0x01a0, B:99:0x01a6, B:101:0x01ac, B:103:0x01b6, B:105:0x01c7, B:107:0x01f8, B:108:0x0200, B:110:0x0203, B:60:0x0131), top: B:4:0x0010, inners: #0, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b5 A[Catch: all -> 0x0241, TryCatch #1 {all -> 0x0241, blocks: (B:5:0x0010, B:7:0x0016, B:9:0x0020, B:10:0x0031, B:12:0x0035, B:14:0x003b, B:16:0x003f, B:17:0x0122, B:18:0x0044, B:20:0x004c, B:21:0x0055, B:23:0x0060, B:25:0x0064, B:27:0x0068, B:29:0x006c, B:31:0x0070, B:33:0x0074, B:34:0x00cc, B:37:0x00ef, B:38:0x00dd, B:40:0x00e1, B:41:0x0080, B:43:0x0084, B:45:0x0094, B:47:0x009a, B:48:0x009f, B:50:0x00a3, B:51:0x00a8, B:53:0x00ac, B:54:0x00b1, B:56:0x00b5, B:58:0x012b, B:61:0x0145, B:63:0x014b, B:66:0x013a, B:69:0x021d, B:70:0x0220, B:73:0x0151, B:75:0x015e, B:77:0x0166, B:80:0x017c, B:82:0x0182, B:85:0x0171, B:89:0x0188, B:91:0x018c, B:93:0x0194, B:111:0x0206, B:113:0x020c, B:115:0x0214, B:125:0x00bc, B:126:0x00c2, B:128:0x00c6, B:129:0x008a, B:130:0x00e9, B:133:0x00f7, B:135:0x00fb, B:137:0x0105, B:139:0x0109, B:140:0x010e, B:142:0x0114, B:144:0x011d, B:145:0x011a, B:146:0x0101, B:147:0x022b, B:79:0x016c, B:95:0x019a, B:97:0x01a0, B:99:0x01a6, B:101:0x01ac, B:103:0x01b6, B:105:0x01c7, B:107:0x01f8, B:108:0x0200, B:110:0x0203, B:60:0x0131), top: B:4:0x0010, inners: #0, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x015e A[Catch: all -> 0x0241, TryCatch #1 {all -> 0x0241, blocks: (B:5:0x0010, B:7:0x0016, B:9:0x0020, B:10:0x0031, B:12:0x0035, B:14:0x003b, B:16:0x003f, B:17:0x0122, B:18:0x0044, B:20:0x004c, B:21:0x0055, B:23:0x0060, B:25:0x0064, B:27:0x0068, B:29:0x006c, B:31:0x0070, B:33:0x0074, B:34:0x00cc, B:37:0x00ef, B:38:0x00dd, B:40:0x00e1, B:41:0x0080, B:43:0x0084, B:45:0x0094, B:47:0x009a, B:48:0x009f, B:50:0x00a3, B:51:0x00a8, B:53:0x00ac, B:54:0x00b1, B:56:0x00b5, B:58:0x012b, B:61:0x0145, B:63:0x014b, B:66:0x013a, B:69:0x021d, B:70:0x0220, B:73:0x0151, B:75:0x015e, B:77:0x0166, B:80:0x017c, B:82:0x0182, B:85:0x0171, B:89:0x0188, B:91:0x018c, B:93:0x0194, B:111:0x0206, B:113:0x020c, B:115:0x0214, B:125:0x00bc, B:126:0x00c2, B:128:0x00c6, B:129:0x008a, B:130:0x00e9, B:133:0x00f7, B:135:0x00fb, B:137:0x0105, B:139:0x0109, B:140:0x010e, B:142:0x0114, B:144:0x011d, B:145:0x011a, B:146:0x0101, B:147:0x022b, B:79:0x016c, B:95:0x019a, B:97:0x01a0, B:99:0x01a6, B:101:0x01ac, B:103:0x01b6, B:105:0x01c7, B:107:0x01f8, B:108:0x0200, B:110:0x0203, B:60:0x0131), top: B:4:0x0010, inners: #0, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x018c A[Catch: all -> 0x0241, TryCatch #1 {all -> 0x0241, blocks: (B:5:0x0010, B:7:0x0016, B:9:0x0020, B:10:0x0031, B:12:0x0035, B:14:0x003b, B:16:0x003f, B:17:0x0122, B:18:0x0044, B:20:0x004c, B:21:0x0055, B:23:0x0060, B:25:0x0064, B:27:0x0068, B:29:0x006c, B:31:0x0070, B:33:0x0074, B:34:0x00cc, B:37:0x00ef, B:38:0x00dd, B:40:0x00e1, B:41:0x0080, B:43:0x0084, B:45:0x0094, B:47:0x009a, B:48:0x009f, B:50:0x00a3, B:51:0x00a8, B:53:0x00ac, B:54:0x00b1, B:56:0x00b5, B:58:0x012b, B:61:0x0145, B:63:0x014b, B:66:0x013a, B:69:0x021d, B:70:0x0220, B:73:0x0151, B:75:0x015e, B:77:0x0166, B:80:0x017c, B:82:0x0182, B:85:0x0171, B:89:0x0188, B:91:0x018c, B:93:0x0194, B:111:0x0206, B:113:0x020c, B:115:0x0214, B:125:0x00bc, B:126:0x00c2, B:128:0x00c6, B:129:0x008a, B:130:0x00e9, B:133:0x00f7, B:135:0x00fb, B:137:0x0105, B:139:0x0109, B:140:0x010e, B:142:0x0114, B:144:0x011d, B:145:0x011a, B:146:0x0101, B:147:0x022b, B:79:0x016c, B:95:0x019a, B:97:0x01a0, B:99:0x01a6, B:101:0x01ac, B:103:0x01b6, B:105:0x01c7, B:107:0x01f8, B:108:0x0200, B:110:0x0203, B:60:0x0131), top: B:4:0x0010, inners: #0, #2, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A02(java.lang.Integer r28) {
        /*
            Method dump skipped, instructions count: 591
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C140966Yy.A02(java.lang.Integer):void");
    }

    public final void A03() {
        A02(C05F.A00);
    }

    public final void A04() {
        A02(C05F.A01);
    }

    public final void A05() {
        if (C06P.A01(this.A06)) {
            this.A0G = false;
        } else {
            this.A0G = true;
            A01(EnumC12410kj.A09, "FragmentNavigator_commit_allowing_state_loss", "Committing transaction allowing stateLoss for onClick event");
        }
        A02(C05F.A01);
    }

    public final void A07() {
        C11T.A03(new PLP(this));
    }

    public final void A0A(int i, int i2, int i3, int i4) {
        this.A00 = i;
        this.A01 = i2;
        this.A03 = i3;
        this.A04 = i4;
    }

    public final void A0C(Fragment fragment) {
        AbstractC10360h2 abstractC10360h2 = this.A06;
        C14240no c14240no = new C14240no(abstractC10360h2);
        c14240no.A03(fragment);
        c14240no.A00();
        abstractC10360h2.A0Z();
    }

    public final void A0F(Fragment fragment, int i) {
        Fragment fragment2 = this.A05;
        if (fragment2 != null) {
            fragment2.setTargetFragment(fragment, i);
        } else {
            A01(EnumC12410kj.A0A, "FragmentNavigator", "Fragment is null when setting target fragment");
        }
    }

    public final void A0G(String str, int i) {
        InterfaceC11380iw interfaceC11380iw = this.A09;
        if (interfaceC11380iw != null) {
            C55782hJ A00 = C55772hI.A00(this.A0K);
            int A0L = this.A06.A0L();
            A00.A0A(this.A07, interfaceC11380iw, this.A0B, A0L);
        }
        this.A06.A0x(str, i);
    }

    public final void A09() {
        A0A(R.anim.right_in, R.anim.left_out, R.anim.left_in, R.anim.right_out);
    }
}
