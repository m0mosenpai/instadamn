package com.google.firebase;

import X.AbstractC166987dD;
import X.C62995SaJ;
import X.C63194Sew;
import X.C64529TIf;
import X.InterfaceC65285ThI;
import X.InterfaceC65434Tk5;
import X.InterfaceC65439TkB;
import X.S3Y;
import X.SSV;
import X.SW7;
import X.SWV;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes10.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        String str;
        ArrayList A1E = AbstractC166987dD.A1E();
        C63194Sew A00 = C63194Sew.A00(SW7.class);
        C62995SaJ.A00(A00, S3Y.class, 2);
        A1E.add(C63194Sew.A01(A00, new InterfaceC65434Tk5() { // from class: X.T9X
            @Override // X.InterfaceC65434Tk5
            public final Object ALR(AbstractC61607RqW abstractC61607RqW) {
                java.util.Set A04 = abstractC61607RqW.A04(S3Y.class);
                C62466SCt c62466SCt = C62466SCt.A01;
                if (c62466SCt == null) {
                    synchronized (C62466SCt.class) {
                        c62466SCt = C62466SCt.A01;
                        if (c62466SCt == null) {
                            c62466SCt = new C62466SCt();
                            C62466SCt.A01 = c62466SCt;
                        }
                    }
                }
                return new SW7(c62466SCt, A04);
            }
        }));
        C63194Sew A002 = C63194Sew.A00(SWV.class);
        C62995SaJ.A00(A002, Context.class, 1);
        C62995SaJ.A00(A002, InterfaceC65285ThI.class, 2);
        A1E.add(C63194Sew.A01(A002, new InterfaceC65434Tk5() { // from class: X.T9U
            @Override // X.InterfaceC65434Tk5
            public final Object ALR(AbstractC61607RqW abstractC61607RqW) {
                return new SWV((Context) abstractC61607RqW.A03(Context.class), abstractC61607RqW.A04(InterfaceC65285ThI.class));
            }
        }));
        A1E.add(SSV.A01("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        A1E.add(SSV.A01("fire-core", "19.5.0"));
        A1E.add(SSV.A01("device-name", Build.PRODUCT.replace(' ', '_').replace('/', '_')));
        A1E.add(SSV.A01("device-model", Build.DEVICE.replace(' ', '_').replace('/', '_')));
        A1E.add(SSV.A01("device-brand", Build.BRAND.replace(' ', '_').replace('/', '_')));
        A1E.add(SSV.A00(new InterfaceC65439TkB() { // from class: X.TE9
            @Override // X.InterfaceC65439TkB
            public final String ATs(Object obj) {
                ApplicationInfo applicationInfo = ((Context) obj).getApplicationInfo();
                if (applicationInfo != null) {
                    return String.valueOf(applicationInfo.targetSdkVersion);
                }
                return "";
            }
        }, "android-target-sdk"));
        A1E.add(SSV.A00(new InterfaceC65439TkB() { // from class: X.TEA
            @Override // X.InterfaceC65439TkB
            public final String ATs(Object obj) {
                ApplicationInfo applicationInfo = ((Context) obj).getApplicationInfo();
                if (applicationInfo != null) {
                    return String.valueOf(applicationInfo.minSdkVersion);
                }
                return "";
            }
        }, "android-min-sdk"));
        A1E.add(SSV.A00(new InterfaceC65439TkB() { // from class: X.TEB
            @Override // X.InterfaceC65439TkB
            public final String ATs(Object obj) {
                Context context = (Context) obj;
                if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                    return "tv";
                }
                if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                    return "watch";
                }
                if (context.getPackageManager().hasSystemFeature(AbstractC111324zv.A00(345))) {
                    return "auto";
                }
                if (context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                    return "embedded";
                }
                return "";
            }
        }, "android-platform"));
        A1E.add(SSV.A00(new InterfaceC65439TkB() { // from class: X.TEC
            @Override // X.InterfaceC65439TkB
            public final String ATs(Object obj) {
                Context context = (Context) obj;
                String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                if (installerPackageName != null) {
                    return installerPackageName.replace(' ', '_').replace('/', '_');
                }
                return "";
            }
        }, "android-installer"));
        try {
            str = C64529TIf.A00.toString();
        } catch (NoClassDefFoundError unused) {
            str = null;
        }
        if (str != null) {
            A1E.add(SSV.A01("kotlin", str));
        }
        return A1E;
    }
}
