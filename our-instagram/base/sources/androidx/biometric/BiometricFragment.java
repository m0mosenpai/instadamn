package androidx.biometric;

import X.AbstractC10360h2;
import X.AbstractC167007dF;
import X.AbstractC58318PtA;
import X.AbstractC58320PtC;
import X.AbstractC61616Rqg;
import X.AbstractC61635Rqz;
import X.AbstractC63224Sfb;
import X.AbstractC63225Sfc;
import X.C0SG;
import X.C0f9;
import X.C14240no;
import X.C2GS;
import X.C58656PzT;
import X.C58657PzU;
import X.C58772Q8e;
import X.C62468SCv;
import X.C62731SNv;
import X.C63141Sdn;
import X.C63291Sgr;
import X.C63628Sqa;
import X.DialogInterfaceOnClickListenerC63418Sjw;
import X.ExecutorC64791TUf;
import X.ExecutorC64792TUg;
import X.Q2S;
import X.Q2T;
import X.Q5e;
import X.SFC;
import X.SFD;
import X.SH3;
import X.SQM;
import X.SVO;
import X.TJ7;
import X.TJ8;
import X.TJ9;
import X.TJA;
import X.TM7;
import X.TPH;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.hardware.biometrics.BiometricPrompt;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.dextricks.Constants;
import java.security.Signature;
import java.util.concurrent.Executor;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* loaded from: classes10.dex */
public final class BiometricFragment extends Fragment {
    public Handler A00 = AbstractC167007dF.A0J();
    public C58772Q8e A01;

    public final void A07(int i) {
        String string;
        if (i != 3 && this.A01.A0M) {
            return;
        }
        if (A04(this)) {
            this.A01.A00 = i;
            if (i == 1) {
                Context context = getContext();
                if (context == null) {
                    string = "";
                } else {
                    string = context.getString(2131962622);
                }
                A03(this, string, 10);
            }
        }
        C58772Q8e c58772Q8e = this.A01;
        SFD sfd = c58772Q8e.A07;
        if (sfd == null) {
            sfd = new SFD();
            c58772Q8e.A07 = sfd;
        }
        CancellationSignal cancellationSignal = sfd.A00;
        if (cancellationSignal != null) {
            try {
                cancellationSignal.cancel();
            } catch (NullPointerException e) {
                Log.e("CancelSignalProvider", "Got NPE while canceling biometric authentication.", e);
            }
            sfd.A00 = null;
        }
        C62731SNv c62731SNv = sfd.A01;
        if (c62731SNv == null) {
            return;
        }
        try {
            c62731SNv.A00();
        } catch (NullPointerException e2) {
            Log.e("CancelSignalProvider", "Got NPE while canceling fingerprint authentication.", e2);
        }
        sfd.A01 = null;
    }

    private void A00() {
        this.A01.A0N = false;
        if (isAdded()) {
            AbstractC10360h2 parentFragmentManager = getParentFragmentManager();
            C0SG c0sg = (C0SG) parentFragmentManager.A0Q("androidx.biometric.FingerprintDialogFragment");
            if (c0sg != null) {
                if (c0sg.isAdded()) {
                    c0sg.A08();
                    return;
                }
                C14240no c14240no = new C14240no(parentFragmentManager);
                c14240no.A03(c0sg);
                c14240no.A01();
            }
        }
    }

    public static void A02(BiometricFragment biometricFragment, C62468SCv c62468SCv) {
        C58772Q8e c58772Q8e = biometricFragment.A01;
        if (!c58772Q8e.A0I) {
            Log.w("BiometricFragment", "Success not sent to client. Client is not awaiting a result.");
        } else {
            c58772Q8e.A0I = false;
            Executor executor = c58772Q8e.A0H;
            if (executor == null) {
                executor = new ExecutorC64792TUg();
            }
            executor.execute(new TM7(biometricFragment, c62468SCv));
        }
        biometricFragment.A05();
    }

    public static void A03(BiometricFragment biometricFragment, CharSequence charSequence, int i) {
        C58772Q8e c58772Q8e = biometricFragment.A01;
        if (!c58772Q8e.A0J) {
            if (!c58772Q8e.A0I) {
                Log.w("BiometricFragment", "Error not sent to client. Client is not awaiting a result.");
                return;
            }
            c58772Q8e.A0I = false;
            Executor executor = c58772Q8e.A0H;
            if (executor == null) {
                executor = new ExecutorC64792TUg();
            }
            executor.execute(new TPH(biometricFragment, charSequence, i));
        }
    }

    public final void A05() {
        this.A01.A0N = false;
        A00();
        if (!this.A01.A0J && isAdded()) {
            C14240no c14240no = new C14240no(getParentFragmentManager());
            c14240no.A03(this);
            c14240no.A01();
        }
        Context context = getContext();
        if (context != null && AbstractC63225Sfc.A01(context, Build.MODEL)) {
            C58772Q8e c58772Q8e = this.A01;
            c58772Q8e.A0K = true;
            this.A00.postDelayed(new TJ9(c58772Q8e), 600L);
        }
    }

    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, X.SNv] */
    public final void A06() {
        String string;
        int i;
        Object obj;
        if (!this.A01.A0N) {
            if (getContext() == null) {
                Log.w("BiometricFragment", "Not showing biometric prompt. Context is null.");
                return;
            }
            C58772Q8e c58772Q8e = this.A01;
            int i2 = 1;
            c58772Q8e.A0N = true;
            c58772Q8e.A0I = true;
            boolean A04 = A04(this);
            Context requireContext = requireContext();
            if (A04) {
                Context applicationContext = requireContext.getApplicationContext();
                FingerprintManager A00 = AbstractC61635Rqz.A00(applicationContext);
                if (A00 != null && A00.isHardwareDetected()) {
                    FingerprintManager A002 = AbstractC61635Rqz.A00(applicationContext);
                    if (A002 != null && A002.hasEnrolledFingerprints()) {
                        if (!isAdded()) {
                            return;
                        }
                        this.A01.A0L = true;
                        if (!AbstractC63225Sfc.A02(applicationContext, Build.MODEL)) {
                            this.A00.postDelayed(new TJ7(this), 500L);
                            new FingerprintDialogFragment().A0B(getParentFragmentManager(), "androidx.biometric.FingerprintDialogFragment");
                        }
                        C58772Q8e c58772Q8e2 = this.A01;
                        c58772Q8e2.A00 = 0;
                        C63141Sdn A03 = AbstractC63224Sfb.A03(c58772Q8e2.A05);
                        C58772Q8e c58772Q8e3 = this.A01;
                        SFD sfd = c58772Q8e3.A07;
                        if (sfd == null) {
                            sfd = new SFD();
                            c58772Q8e3.A07 = sfd;
                        }
                        C62731SNv c62731SNv = sfd.A01;
                        C62731SNv c62731SNv2 = c62731SNv;
                        if (c62731SNv == null) {
                            ?? obj2 = new Object();
                            sfd.A01 = obj2;
                            c62731SNv2 = obj2;
                        }
                        SFC sfc = c58772Q8e3.A03;
                        if (sfc == null) {
                            sfc = new SFC(new Q5e(c58772Q8e3));
                            c58772Q8e3.A03 = sfc;
                        }
                        SVO svo = sfc.A01;
                        if (svo == null) {
                            svo = new SVO(sfc);
                            sfc.A01 = svo;
                        }
                        try {
                            synchronized (c62731SNv2) {
                                if (c62731SNv2.A00 == null) {
                                    CancellationSignal cancellationSignal = new CancellationSignal();
                                    c62731SNv2.A00 = cancellationSignal;
                                    if (c62731SNv2.A02) {
                                        cancellationSignal.cancel();
                                    }
                                }
                                obj = c62731SNv2.A00;
                            }
                            CancellationSignal cancellationSignal2 = (CancellationSignal) obj;
                            FingerprintManager A003 = AbstractC61635Rqz.A00(applicationContext);
                            if (A003 == null) {
                                return;
                            }
                            FingerprintManager.CryptoObject cryptoObject = null;
                            if (A03 != null) {
                                Cipher cipher = A03.A01;
                                if (cipher != null) {
                                    cryptoObject = new FingerprintManager.CryptoObject(cipher);
                                } else {
                                    Signature signature = A03.A00;
                                    if (signature != null) {
                                        cryptoObject = new FingerprintManager.CryptoObject(signature);
                                    } else {
                                        Mac mac = A03.A02;
                                        if (mac != null) {
                                            cryptoObject = new FingerprintManager.CryptoObject(mac);
                                        }
                                    }
                                }
                            }
                            A003.authenticate(cryptoObject, cancellationSignal2, 0, new Q2T(svo), null);
                            return;
                        } catch (NullPointerException e) {
                            Log.e("BiometricFragment", "Got NPE while authenticating with fingerprint.", e);
                            if (applicationContext != null) {
                                i = 2131962618;
                            }
                        }
                    } else {
                        i2 = 11;
                    }
                } else {
                    i2 = 12;
                }
                if (applicationContext != null) {
                    if (11 != i2) {
                        i = 2131962619;
                    } else {
                        i = 2131962621;
                    }
                    string = applicationContext.getString(i);
                    A03(this, string, i2);
                    A05();
                    return;
                }
                string = "";
                A03(this, string, i2);
                A05();
                return;
            }
            BiometricPrompt.Builder builder = new BiometricPrompt.Builder(requireContext.getApplicationContext());
            SH3 sh3 = this.A01.A06;
            if (sh3 != null) {
                CharSequence charSequence = sh3.A03;
                CharSequence charSequence2 = sh3.A01;
                if (charSequence != null) {
                    builder.setTitle(charSequence);
                }
                if (charSequence2 != null) {
                    builder.setDescription(charSequence2);
                }
            }
            C58772Q8e c58772Q8e4 = this.A01;
            CharSequence charSequence3 = c58772Q8e4.A0G;
            if (charSequence3 == null) {
                SH3 sh32 = c58772Q8e4.A06;
                if (sh32 != null) {
                    charSequence3 = sh32.A02;
                    if (charSequence3 == null) {
                        charSequence3 = "";
                    }
                } else {
                    charSequence3 = null;
                }
            }
            if (!TextUtils.isEmpty(charSequence3)) {
                Executor executor = this.A01.A0H;
                if (executor == null) {
                    executor = new ExecutorC64792TUg();
                }
                C58772Q8e c58772Q8e5 = this.A01;
                DialogInterface.OnClickListener onClickListener = c58772Q8e5.A02;
                if (onClickListener == null) {
                    onClickListener = new DialogInterfaceOnClickListenerC63418Sjw(c58772Q8e5);
                    c58772Q8e5.A02 = onClickListener;
                }
                builder.setNegativeButton(charSequence3, executor, onClickListener);
            }
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 29) {
                SQM.A00(builder);
            }
            int A01 = this.A01.A01();
            if (i3 >= 30) {
                AbstractC61616Rqg.A00(builder, A01);
            } else if (i3 >= 29) {
                SQM.A01(builder, AbstractC167007dF.A1M(A01 & Constants.LOAD_RESULT_PGO));
            }
            BiometricPrompt build = builder.build();
            Context context = getContext();
            BiometricPrompt.CryptoObject A004 = AbstractC63224Sfb.A00(this.A01.A05);
            C58772Q8e c58772Q8e6 = this.A01;
            SFD sfd2 = c58772Q8e6.A07;
            if (sfd2 == null) {
                sfd2 = new SFD();
                c58772Q8e6.A07 = sfd2;
            }
            CancellationSignal cancellationSignal3 = sfd2.A00;
            if (cancellationSignal3 == null) {
                cancellationSignal3 = new CancellationSignal();
                sfd2.A00 = cancellationSignal3;
            }
            ExecutorC64791TUf executorC64791TUf = new ExecutorC64791TUf();
            C58772Q8e c58772Q8e7 = this.A01;
            SFC sfc2 = c58772Q8e7.A03;
            if (sfc2 == null) {
                sfc2 = new SFC(new Q5e(c58772Q8e7));
                c58772Q8e7.A03 = sfc2;
            }
            BiometricPrompt.AuthenticationCallback authenticationCallback = sfc2.A00;
            if (authenticationCallback == null) {
                authenticationCallback = new Q2S(sfc2.A02);
                sfc2.A00 = authenticationCallback;
            }
            try {
                if (A004 == null) {
                    build.authenticate(cancellationSignal3, executorC64791TUf, authenticationCallback);
                } else {
                    build.authenticate(A004, cancellationSignal3, executorC64791TUf, authenticationCallback);
                }
            } catch (NullPointerException e2) {
                Log.e("BiometricFragment", "Got NPE while authenticating with biometric prompt.", e2);
                if (context != null) {
                    string = context.getString(2131957625);
                }
            }
        }
    }

    public final boolean A0A() {
        if (Build.VERSION.SDK_INT <= 28 && (this.A01.A01() & Constants.LOAD_RESULT_PGO) != 0) {
            return true;
        }
        return false;
    }

    public static void A01(BiometricFragment biometricFragment) {
        CharSequence charSequence;
        CharSequence charSequence2;
        int i;
        int i2;
        FragmentActivity activity = biometricFragment.getActivity();
        if (activity == null) {
            Log.e("BiometricFragment", "Failed to check device credential. Client FragmentActivity not found.");
            return;
        }
        KeyguardManager keyguardManager = (KeyguardManager) activity.getSystemService(KeyguardManager.class);
        if (keyguardManager == null) {
            i = 12;
            i2 = 2131963198;
        } else {
            SH3 sh3 = biometricFragment.A01.A06;
            if (sh3 != null) {
                charSequence = sh3.A03;
                charSequence2 = sh3.A01;
            } else {
                charSequence = null;
                charSequence2 = null;
            }
            Intent createConfirmDeviceCredentialIntent = keyguardManager.createConfirmDeviceCredentialIntent(charSequence, charSequence2);
            if (createConfirmDeviceCredentialIntent == null) {
                i = 14;
                i2 = 2131963197;
            } else {
                biometricFragment.A01.A0J = true;
                if (A04(biometricFragment)) {
                    biometricFragment.A00();
                }
                createConfirmDeviceCredentialIntent.setFlags(134742016);
                biometricFragment.startActivityForResult(createConfirmDeviceCredentialIntent, 1);
                return;
            }
        }
        A03(biometricFragment, biometricFragment.getString(i2), i);
        biometricFragment.A05();
    }

    public static boolean A04(BiometricFragment biometricFragment) {
        FragmentActivity activity = biometricFragment.getActivity();
        if (activity != null && biometricFragment.A01.A05 != null && AbstractC63225Sfc.A03(activity, Build.MANUFACTURER, Build.MODEL)) {
            return true;
        }
        if (Build.VERSION.SDK_INT == 28) {
            Context context = biometricFragment.getContext();
            if (context == null || context.getPackageManager() == null || !context.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0052, code lost:
    
        if (r1 != 3) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d4, code lost:
    
        if (X.AbstractC63225Sfc.A02(r1, android.os.Build.MODEL) == false) goto L60;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A08(int r5, java.lang.CharSequence r6) {
        /*
            r4 = this;
            switch(r5) {
                case 1: goto L5;
                case 2: goto L5;
                case 3: goto L5;
                case 4: goto L5;
                case 5: goto L5;
                case 6: goto L3;
                case 7: goto L5;
                case 8: goto L5;
                case 9: goto L5;
                case 10: goto L5;
                case 11: goto L5;
                case 12: goto L5;
                case 13: goto L5;
                case 14: goto L5;
                case 15: goto L5;
                default: goto L3;
            }
        L3:
            r5 = 8
        L5:
            android.content.Context r2 = r4.getContext()
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 >= r0) goto L38
            r0 = 7
            if (r5 == r0) goto L16
            r0 = 9
            if (r5 != r0) goto L38
        L16:
            if (r2 == 0) goto L38
            java.lang.Class<android.app.KeyguardManager> r0 = android.app.KeyguardManager.class
            java.lang.Object r0 = r2.getSystemService(r0)
            android.app.KeyguardManager r0 = (android.app.KeyguardManager) r0
            if (r0 == 0) goto L38
            boolean r0 = r0.isDeviceSecure()
            if (r0 == 0) goto L38
            X.Q8e r0 = r4.A01
            int r1 = r0.A01()
            r0 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L38
            A01(r4)
            return
        L38:
            boolean r0 = A04(r4)
            if (r0 == 0) goto L8b
            if (r6 != 0) goto L48
            android.content.Context r2 = r4.getContext()
            if (r2 != 0) goto L5b
            java.lang.String r6 = ""
        L48:
            r1 = 5
            X.Q8e r0 = r4.A01
            if (r5 != r1) goto L9b
            int r1 = r0.A00
            if (r1 == 0) goto L54
            r0 = 3
            if (r1 != r0) goto L57
        L54:
            A03(r4, r6, r5)
        L57:
            r4.A05()
            return
        L5b:
            r0 = 1
            if (r5 == r0) goto L87
            r0 = 7
            if (r5 == r0) goto L83
            switch(r5) {
                case 9: goto L83;
                case 10: goto L7f;
                case 11: goto L7b;
                case 12: goto L77;
                default: goto L64;
            }
        L64:
            java.lang.String r0 = "Unknown error code: "
            java.lang.String r1 = X.AnonymousClass001.A0O(r0, r5)
            java.lang.String r0 = "BiometricUtils"
            android.util.Log.e(r0, r1)
            r0 = 2131957625(0x7f131779, float:1.955184E38)
        L72:
            java.lang.String r6 = r2.getString(r0)
            goto L48
        L77:
            r0 = 2131962619(0x7f132afb, float:1.9561968E38)
            goto L72
        L7b:
            r0 = 2131962621(0x7f132afd, float:1.9561972E38)
            goto L72
        L7f:
            r0 = 2131962622(0x7f132afe, float:1.9561974E38)
            goto L72
        L83:
            r0 = 2131962620(0x7f132afc, float:1.956197E38)
            goto L72
        L87:
            r0 = 2131962618(0x7f132afa, float:1.9561966E38)
            goto L72
        L8b:
            if (r6 != 0) goto L54
            r0 = 2131957625(0x7f131779, float:1.955184E38)
            java.lang.String r1 = r4.getString(r0)
            java.lang.String r0 = " "
            java.lang.String r6 = X.AnonymousClass001.A0b(r1, r0, r5)
            goto L54
        L9b:
            boolean r0 = r0.A0L
            if (r0 == 0) goto Lab
            A03(r4, r6, r5)
            r4.A05()
        La5:
            X.Q8e r1 = r4.A01
            r0 = 1
            r1.A0L = r0
            return
        Lab:
            r2 = r6
            if (r6 != 0) goto Lb5
            r0 = 2131957625(0x7f131779, float:1.955184E38)
            java.lang.String r2 = r4.getString(r0)
        Lb5:
            X.Q8e r1 = r4.A01
            r0 = 2
            r1.A02(r0)
            X.Q8e r0 = r4.A01
            r0.A03(r2)
            android.os.Handler r3 = r4.A00
            X.TPI r2 = new X.TPI
            r2.<init>(r4, r6, r5)
            android.content.Context r1 = r4.getContext()
            if (r1 == 0) goto Ld6
            java.lang.String r0 = android.os.Build.MODEL
            boolean r1 = X.AbstractC63225Sfc.A02(r1, r0)
            r0 = 0
            if (r1 != 0) goto Ld8
        Ld6:
            r0 = 2000(0x7d0, float:2.803E-42)
        Ld8:
            long r0 = (long) r0
            r3.postDelayed(r2, r0)
            goto La5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.biometric.BiometricFragment.A08(int, java.lang.CharSequence):void");
    }

    public final void A09(C63291Sgr c63291Sgr, SH3 sh3) {
        String str;
        FragmentActivity activity = getActivity();
        if (activity == null) {
            Log.e("BiometricFragment", "Not launching prompt. Client activity was null.");
            return;
        }
        C58772Q8e c58772Q8e = this.A01;
        c58772Q8e.A06 = sh3;
        int i = sh3.A00;
        if (i == 0) {
            i = 255;
            if (c63291Sgr != null) {
                i = 15;
            }
        }
        if (Build.VERSION.SDK_INT < 30 && i == 15 && c63291Sgr == null) {
            c63291Sgr = AbstractC63224Sfb.A01();
        }
        c58772Q8e.A05 = c63291Sgr;
        boolean A0A = A0A();
        C58772Q8e c58772Q8e2 = this.A01;
        if (A0A) {
            str = getString(2131956566);
        } else {
            str = null;
        }
        c58772Q8e2.A0G = str;
        if (A0A() && new C58656PzT(new C58657PzU(activity)).A03(255) != 0) {
            this.A01.A0I = true;
            A01(this);
        } else if (this.A01.A0K) {
            this.A00.postDelayed(new TJ8(this), 600L);
        } else {
            A06();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            this.A01.A0J = false;
            if (i2 == -1) {
                A02(this, new C62468SCv(null, 1));
            } else {
                A03(this, getString(2131963199), 10);
                A05();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-847091015);
        super.onCreate(bundle);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C58772Q8e A0H = AbstractC58320PtC.A0H(activity);
            this.A01 = A0H;
            C2GS c2gs = A0H.A0A;
            if (c2gs == null) {
                c2gs = AbstractC58318PtA.A0J();
                A0H.A0A = c2gs;
            }
            C63628Sqa.A02(this, c2gs, 0);
            C58772Q8e c58772Q8e = this.A01;
            C2GS c2gs2 = c58772Q8e.A08;
            if (c2gs2 == null) {
                c2gs2 = AbstractC58318PtA.A0J();
                c58772Q8e.A08 = c2gs2;
            }
            C63628Sqa.A02(this, c2gs2, 1);
            C58772Q8e c58772Q8e2 = this.A01;
            C2GS c2gs3 = c58772Q8e2.A09;
            if (c2gs3 == null) {
                c2gs3 = AbstractC58318PtA.A0J();
                c58772Q8e2.A09 = c2gs3;
            }
            C63628Sqa.A02(this, c2gs3, 2);
            C58772Q8e c58772Q8e3 = this.A01;
            C2GS c2gs4 = c58772Q8e3.A0D;
            if (c2gs4 == null) {
                c2gs4 = AbstractC58318PtA.A0J();
                c58772Q8e3.A0D = c2gs4;
            }
            C63628Sqa.A02(this, c2gs4, 3);
            C58772Q8e c58772Q8e4 = this.A01;
            C2GS c2gs5 = c58772Q8e4.A0F;
            if (c2gs5 == null) {
                c2gs5 = AbstractC58318PtA.A0J();
                c58772Q8e4.A0F = c2gs5;
            }
            C63628Sqa.A02(this, c2gs5, 4);
            C58772Q8e c58772Q8e5 = this.A01;
            C2GS c2gs6 = c58772Q8e5.A0E;
            if (c2gs6 == null) {
                c2gs6 = AbstractC58318PtA.A0J();
                c58772Q8e5.A0E = c2gs6;
            }
            C63628Sqa.A02(this, c2gs6, 5);
        }
        C0f9.A09(-1337394849, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(-18546844);
        super.onStart();
        if (Build.VERSION.SDK_INT == 29) {
            C58772Q8e c58772Q8e = this.A01;
            if ((c58772Q8e.A01() & Constants.LOAD_RESULT_PGO) != 0) {
                c58772Q8e.A0M = true;
                this.A00.postDelayed(new TJA(c58772Q8e), 250L);
            }
        }
        C0f9.A09(-892217803, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        FragmentActivity activity;
        int A02 = C0f9.A02(-575955297);
        super.onStop();
        if (Build.VERSION.SDK_INT < 29 && !this.A01.A0J && ((activity = getActivity()) == null || !activity.isChangingConfigurations())) {
            A07(0);
        }
        C0f9.A09(-868057281, A02);
    }
}
