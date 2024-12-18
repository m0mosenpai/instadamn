package X;

import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.os.Handler;
import android.os.SystemClock;
import com.facebook.smartcapture.diagnostic.DiagnosticInfo;
import com.facebook.smartcapture.docauth.CaptureState;
import com.facebook.smartcapture.docauth.CreditCardScannerResult;
import com.facebook.smartcapture.docauth.DocAuthManager;
import com.facebook.smartcapture.docauth.DocAuthManagerDelegate;
import com.facebook.smartcapture.docauth.DocAuthResult;
import com.facebook.smartcapture.docauth.DocumentType;
import com.facebook.smartcapture.flow.IdCaptureConfig;
import com.facebook.smartcapture.logging.FederatedAnalyticsCardData;
import com.facebook.smartcapture.logging.IdCaptureLogger;
import com.facebook.smartcapture.logging.IdCaptureStep;
import com.facebook.smartcapture.logging.InMemoryLogger;
import com.facebook.smartcapture.view.IdCaptureActivity;
import com.facebook.smartcapture.view.IdCaptureBaseActivity;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: X.SzB, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64094SzB implements InterfaceC196578mn, DocAuthManagerDelegate {
    public int A00;
    public int A01;
    public long A02;
    public EnumC61101RfG A03;
    public CaptureState A04;
    public DocumentType A05;
    public C69274Vki A06;
    public boolean A07;
    public boolean A08;
    public Point[] A09;
    public final DocAuthManager A0A;
    public final DocumentType A0B;
    public final C63196Sey A0C;
    public final IdCaptureConfig A0D;
    public final IdCaptureLogger A0E;
    public final InMemoryLogger A0F;
    public final Q4I A0G;
    public final C62428SBd A0H;
    public final String A0I;
    public final WeakReference A0J;
    public final WeakReference A0K;
    public final Map A0L;
    public final Handler A0M;
    public final C62429SBe A0N;

    public C64094SzB(Context context, DocAuthManager docAuthManager, DocumentType documentType, IdCaptureConfig idCaptureConfig, IdCaptureLogger idCaptureLogger, InterfaceC65547TmM interfaceC65547TmM, S5Q s5q) {
        C14360o3.A0B(documentType, 5);
        this.A0D = idCaptureConfig;
        this.A0J = AbstractC25225BEi.A16(context);
        this.A0B = documentType;
        this.A0K = AbstractC25225BEi.A16(interfaceC65547TmM);
        this.A0A = docAuthManager;
        CaptureState captureState = CaptureState.INITIAL;
        this.A04 = captureState;
        this.A0M = AbstractC167007dF.A0J();
        this.A0H = new C62428SBd(this);
        C62429SBe c62429SBe = new C62429SBe(this);
        this.A0N = c62429SBe;
        docAuthManager.setDelegate(this);
        this.A0E = idCaptureLogger;
        String A0n = AbstractC166997dE.A0n();
        C14360o3.A07(A0n);
        this.A0I = A0n;
        this.A0F = new InMemoryLogger(idCaptureLogger);
        this.A0L = AbstractC166987dD.A1G();
        this.A03 = EnumC61101RfG.A03;
        this.A04 = captureState;
        boolean z = idCaptureConfig.A0I;
        if (!z && idCaptureConfig.A01().A00 >= 2) {
            this.A06 = new C69274Vki();
        } else {
            this.A06 = null;
        }
        this.A0G = new Q4I(context, this);
        C63196Sey c63196Sey = new C63196Sey(context, idCaptureLogger, c62429SBe, z);
        this.A0C = c63196Sey;
        boolean z2 = false;
        if (s5q != null) {
            C14360o3.A07(idCaptureConfig.A0E);
            if (z) {
                z2 = true;
            }
        } else {
            z2 = z;
        }
        this.A08 = z2;
        if (z2) {
            c63196Sey.A00 = idCaptureConfig.A06;
        }
    }

    @Override // X.InterfaceC196578mn
    public final void DEF(Exception exc) {
        C14360o3.A0B(exc, 0);
        this.A0E.logError("Photo save error", exc);
        InterfaceC65547TmM interfaceC65547TmM = (InterfaceC65547TmM) this.A0K.get();
        if (interfaceC65547TmM != null) {
            IdCaptureActivity idCaptureActivity = (IdCaptureActivity) interfaceC65547TmM;
            idCaptureActivity.runOnUiThread(new TL9(idCaptureActivity));
        }
    }

    @Override // X.InterfaceC196578mn
    public final void DYZ(C196748n4 c196748n4) {
        C14360o3.A0B(c196748n4, 0);
        Y6Z.A00(new CallableC64789TUd(1, c196748n4, this)).A05(new C48116LRq(this, 1), Y6Z.A0A);
    }

    @Override // X.InterfaceC196578mn
    public final /* synthetic */ void Dbk(float f) {
    }

    @Override // X.InterfaceC196578mn
    public final void Dtw(C196748n4 c196748n4) {
    }

    @Override // com.facebook.smartcapture.docauth.DocAuthManagerDelegate
    public final void onDocAuthResultAvailable(DocAuthResult docAuthResult, int i) {
        CaptureState captureState;
        C14360o3.A0B(docAuthResult, 0);
        CaptureState captureState2 = this.A04;
        if (captureState2 != CaptureState.MANUAL_CAPTURE && captureState2 != CaptureState.CAPTURING_MANUAL && captureState2 != CaptureState.CAPTURING_AUTOMATIC) {
            Point[] pointArr = docAuthResult.detectedCorners;
            if (pointArr != null) {
                C0s6 c0s6 = new C0s6(pointArr);
                while (true) {
                    if (c0s6.hasNext()) {
                        Point point = (Point) c0s6.next();
                        if (point.x == 0 && point.y == 0) {
                            break;
                        }
                    } else {
                        this.A09 = docAuthResult.detectedCorners;
                        break;
                    }
                }
            }
            if (!docAuthResult.isFound) {
                captureState = CaptureState.ID_TYPE_DETECTION;
            } else {
                if (docAuthResult.isAligned) {
                    if (docAuthResult.isBlurry) {
                        captureState = CaptureState.BLUR_DETECTED;
                    } else if (docAuthResult._hasGlare) {
                        captureState = CaptureState.GLARE_DETECTED;
                    } else if (this.A0D.A0I) {
                        CreditCardScannerResult creditCardScannerResult = docAuthResult.creditCardScannerResult;
                        if (creditCardScannerResult != null && creditCardScannerResult.isFound) {
                            captureState = CaptureState.CREDIT_CARD_SCANNED;
                        } else {
                            captureState = CaptureState.SCANNING_CREDIT_CARD;
                        }
                    } else if (this.A07 && SystemClock.elapsedRealtime() - this.A02 >= 800) {
                        if (this.A06 != null) {
                            captureState = CaptureState.HOLDING_STEADY;
                        } else {
                            captureState = CaptureState.CAPTURING_AUTOMATIC;
                        }
                    }
                }
                captureState = CaptureState.ID_FOUND;
            }
            if (captureState != this.A04) {
                this.A04 = captureState;
                A01(docAuthResult, this, true);
            }
        }
    }

    private final void A00(DocAuthResult docAuthResult) {
        CreditCardScannerResult creditCardScannerResult = docAuthResult.creditCardScannerResult;
        if (creditCardScannerResult != null) {
            this.A0E.logFederatedAnalyticsCardData(new FederatedAnalyticsCardData(this.A0I, creditCardScannerResult.isFound, creditCardScannerResult.number, creditCardScannerResult.expiryDate, creditCardScannerResult.name, docAuthResult.detectedCorners, false, creditCardScannerResult.processingTime, creditCardScannerResult.ocrResult, creditCardScannerResult.digitOcrResult, creditCardScannerResult.textOcrResult, creditCardScannerResult.mergedOcrResult));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b7, code lost:
    
        if (r0 != 1) goto L43;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0021. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(com.facebook.smartcapture.docauth.DocAuthResult r12, X.C64094SzB r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 808
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64094SzB.A01(com.facebook.smartcapture.docauth.DocAuthResult, X.SzB, boolean):void");
    }

    public final void A02() {
        EnumC61111RfR A00 = this.A0D.A00();
        C14360o3.A07(A00);
        Object obj = (InterfaceC65547TmM) this.A0K.get();
        if (obj != null) {
            if (this.A03 == EnumC61101RfG.A03 && A00 == EnumC61111RfR.A04) {
                this.A03 = EnumC61101RfG.A02;
                IdCaptureBaseActivity idCaptureBaseActivity = (IdCaptureBaseActivity) obj;
                idCaptureBaseActivity.A05 = IdCaptureStep.FIRST_PHOTO_CONFIRMATION;
                idCaptureBaseActivity.A02().logStepChange(idCaptureBaseActivity.A05, IdCaptureStep.SECOND_PHOTO_CAPTURE);
                return;
            }
            IdCaptureActivity idCaptureActivity = (IdCaptureActivity) obj;
            Intent A04 = AbstractC31171DnF.A04();
            A04.setData(idCaptureActivity.A00);
            C64094SzB c64094SzB = idCaptureActivity.A03;
            if (c64094SzB == null) {
                C14360o3.A0F("presenter");
                throw C00O.createAndThrow();
            }
            Map A12 = AbstractC58318PtA.A12(c64094SzB.A0L);
            A04.putExtra("front_file_path", idCaptureActivity.A01().A0C);
            A04.putExtra("front_authenticity_upload_medium", (Serializable) A12.get(EnumC61110RfQ.A03));
            EnumC61111RfR A002 = idCaptureActivity.A01().A00();
            C14360o3.A07(A002);
            EnumC61110RfQ enumC61110RfQ = EnumC61110RfQ.A02;
            if (A002 == EnumC61111RfR.A04) {
                A04.putExtra("back_file_path", idCaptureActivity.A01().A0B);
                A04.putExtra("back_authenticity_upload_medium", (Serializable) A12.get(enumC61110RfQ));
            }
            AbstractC31180DnO.A0y(idCaptureActivity, A04);
            idCaptureActivity.A02().logFlowEnd();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        if (r1 != com.facebook.smartcapture.docauth.CaptureState.DOWNLOAD_FAILED) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A03() {
        /*
            r4 = this;
            com.facebook.smartcapture.flow.IdCaptureConfig r0 = r4.A0D
            X.Rg7 r1 = r0.A01()
            X.Rg7 r0 = X.EnumC61146Rg7.A03
            r3 = 0
            boolean r2 = X.AbstractC167007dF.A1X(r1, r0)
            com.facebook.smartcapture.docauth.CaptureState r1 = r4.A04
            com.facebook.smartcapture.docauth.CaptureState r0 = com.facebook.smartcapture.docauth.CaptureState.INITIAL
            if (r1 == r0) goto L2e
            com.facebook.smartcapture.docauth.CaptureState r0 = com.facebook.smartcapture.docauth.CaptureState.DOWNLOADING_DEPS
            if (r1 == r0) goto L2e
            com.facebook.smartcapture.docauth.CaptureState r0 = com.facebook.smartcapture.docauth.CaptureState.MANUAL_CAPTURE
            if (r1 == r0) goto L3d
            com.facebook.smartcapture.docauth.CaptureState r0 = com.facebook.smartcapture.docauth.CaptureState.CAPTURING_MANUAL
            if (r1 == r0) goto L3d
            com.facebook.smartcapture.docauth.CaptureState r0 = com.facebook.smartcapture.docauth.CaptureState.DOWNLOAD_FAILED
            if (r1 == r0) goto L27
        L23:
            com.facebook.smartcapture.docauth.CaptureState r0 = com.facebook.smartcapture.docauth.CaptureState.ID_TYPE_DETECTION
        L25:
            r4.A04 = r0
        L27:
            r4.A07 = r3
            r0 = 0
            A01(r0, r4, r3)
            return
        L2e:
            boolean r0 = r4.A08
            if (r0 == 0) goto L3d
            X.Sey r0 = r4.A0C
            boolean r0 = r0.A03()
            if (r0 != 0) goto L3d
            com.facebook.smartcapture.docauth.CaptureState r0 = com.facebook.smartcapture.docauth.CaptureState.DOWNLOADING_DEPS
            goto L25
        L3d:
            if (r2 == 0) goto L23
            com.facebook.smartcapture.docauth.CaptureState r0 = com.facebook.smartcapture.docauth.CaptureState.MANUAL_CAPTURE
            goto L25
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64094SzB.A03():void");
    }

    @Override // X.InterfaceC196578mn
    public final void D2R() {
        this.A01 = this.A00;
    }

    @Override // com.facebook.smartcapture.docauth.DocAuthManagerDelegate
    public final void onDiagnosticInfoAvailable(DiagnosticInfo diagnosticInfo) {
        if (this.A0K.get() != null) {
            C14360o3.A0A(null);
            C14360o3.A0A(diagnosticInfo);
            throw AbstractC166987dD.A15("setDiagnosticInfo");
        }
    }
}
