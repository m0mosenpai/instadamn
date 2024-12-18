package com.facebook.react.views.debuggingoverlay;

import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC58324PtG;
import X.C14360o3;
import X.C62171S0s;
import X.C62545SFw;
import X.Q4O;
import X.R3N;
import X.TXX;
import android.view.View;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.bridge.NoSuchKeyException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UnexpectedNativeTypeException;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.SimpleViewManager;
import java.util.ArrayList;

@ReactModule(name = DebuggingOverlayManager.REACT_CLASS)
/* loaded from: classes10.dex */
public final class DebuggingOverlayManager extends SimpleViewManager {
    public static final C62171S0s Companion = new Object();
    public static final String REACT_CLASS = "DebuggingOverlay";

    public DebuggingOverlayManager() {
        super(null);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Q4O createViewInstance(R3N r3n) {
        C14360o3.A0B(r3n, 0);
        return new Q4O(r3n);
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(Q4O q4o, String str, ReadableArray readableArray) {
        RuntimeException runtimeException;
        AbstractC167007dF.A1K(q4o, str);
        int hashCode = str.hashCode();
        if (hashCode != -1942063165) {
            if (hashCode != 1326903961) {
                if (hashCode == 1385348555 && str.equals("highlightElements")) {
                    if (readableArray != null) {
                        ReadableArray array = readableArray.getArray(0);
                        ArrayList A1E = AbstractC166987dD.A1E();
                        int size = array.size();
                        boolean z = true;
                        for (int i = 0; i < size; i++) {
                            try {
                                A1E.add(AbstractC58324PtG.A04(array.getMap(i)));
                            } catch (Exception e) {
                                if ((e instanceof NoSuchKeyException) || (e instanceof UnexpectedNativeTypeException)) {
                                    TXX.A00("Unexpected payload for highlighting elements: every element should have x, y, width, height fields", REACT_CLASS);
                                    z = false;
                                } else {
                                    throw e;
                                }
                            }
                        }
                        if (z) {
                            q4o.setHighlightedElementsRectangles(A1E);
                            return;
                        }
                        return;
                    }
                    return;
                }
            } else if (str.equals("highlightTraceUpdates")) {
                if (readableArray != null) {
                    ReadableArray array2 = readableArray.getArray(0);
                    ArrayList A1E2 = AbstractC166987dD.A1E();
                    int size2 = array2.size();
                    boolean z2 = true;
                    for (int i2 = 0; i2 < size2; i2++) {
                        ReadableMap map = array2.getMap(i2);
                        ReadableMap map2 = map.getMap("rectangle");
                        if (map2 == null) {
                            runtimeException = new RuntimeException("Unexpected payload for highlighting trace updates: rectangle field is null");
                            ReactSoftExceptionLogger.logSoftException(REACT_CLASS, runtimeException);
                        }
                        try {
                            A1E2.add(new C62545SFw(AbstractC58324PtG.A04(map2), map.getInt(PublicKeyCredentialControllerUtility.JSON_KEY_ID), map.getInt("color")));
                        } catch (Exception e2) {
                            if ((e2 instanceof NoSuchKeyException) || (e2 instanceof UnexpectedNativeTypeException)) {
                                TXX.A00("Unexpected payload for highlighting trace updates: rectangle field should have x, y, width, height fields", REACT_CLASS);
                                z2 = false;
                            } else {
                                throw e2;
                            }
                        }
                    }
                    if (!z2) {
                        return;
                    }
                    q4o.setTraceUpdates(A1E2);
                    return;
                }
                return;
            }
        } else if (str.equals("clearElementsHighlights")) {
            q4o.A00.clear();
            q4o.invalidate();
            return;
        }
        runtimeException = new RuntimeException("Received unexpected command in DebuggingOverlayManager");
        ReactSoftExceptionLogger.logSoftException(REACT_CLASS, runtimeException);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public /* bridge */ /* synthetic */ View createViewInstance(R3N r3n) {
        C14360o3.A0B(r3n, 0);
        return new Q4O(r3n);
    }
}
