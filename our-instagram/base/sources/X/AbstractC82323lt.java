package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.direct.smartsuggestion.model.SmartSuggestion;
import java.io.IOException;
import java.util.HashMap;

/* renamed from: X.3lt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC82323lt {
    public static SmartSuggestion parseFromJson(C16L c16l) {
        EnumC82333lv enumC82333lv;
        Integer num;
        C14360o3.A0B(c16l, 0);
        try {
            SmartSuggestion smartSuggestion = new SmartSuggestion();
            C16R A11 = c16l.A11();
            C16R c16r = C16R.A0D;
            if (A11 != c16r) {
                c16l.A0z();
                return null;
            }
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r2 = C16R.A09;
                if (A1J != c16r2) {
                    String A0q = c16l.A0q();
                    c16l.A1J();
                    HashMap hashMap = null;
                    String str = null;
                    String str2 = null;
                    String str3 = null;
                    String str4 = null;
                    String str5 = null;
                    if (PublicKeyCredentialControllerUtility.JSON_KEY_TYPE.equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str = c16l.A1P();
                        }
                        C14360o3.A0B(str, 0);
                        Integer[] A00 = C05F.A00(7);
                        int length = A00.length;
                        int i = 0;
                        while (true) {
                            if (i < length) {
                                num = A00[i];
                                if (C14360o3.A0K(AbstractC82353lx.A00(num), str)) {
                                    break;
                                }
                                i++;
                            } else {
                                num = C05F.A00;
                                break;
                            }
                        }
                        C14360o3.A0B(num, 0);
                        smartSuggestion.A03 = num;
                    } else if (CacheBehaviorLogger.SOURCE.equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str2 = c16l.A1P();
                        }
                        C14360o3.A0B(str2, 0);
                        EnumC82333lv[] values = EnumC82333lv.values();
                        int length2 = values.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 < length2) {
                                enumC82333lv = values[i2];
                                if (C14360o3.A0K(enumC82333lv.A01, str2)) {
                                    break;
                                }
                                i2++;
                            } else {
                                enumC82333lv = EnumC82333lv.A09;
                                break;
                            }
                        }
                        smartSuggestion.A02 = enumC82333lv;
                    } else if ("body".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str3 = c16l.A1P();
                        }
                        smartSuggestion.A04 = str3;
                    } else if (DialogModule.KEY_TITLE.equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str4 = c16l.A1P();
                        }
                        smartSuggestion.A06 = str4;
                    } else if (TraceFieldType.RequestID.equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str5 = c16l.A1P();
                        }
                        smartSuggestion.A05 = str5;
                    } else if ("primary_cta".equals(A0q)) {
                        smartSuggestion.A00 = AbstractC82363ly.parseFromJson(c16l);
                    } else if ("secondary_cta".equals(A0q)) {
                        smartSuggestion.A01 = AbstractC82363ly.parseFromJson(c16l);
                    } else if ("additional_info".equals(A0q)) {
                        if (c16l.A11() == c16r) {
                            HashMap hashMap2 = new HashMap();
                            while (c16l.A1J() != c16r2) {
                                String A1P = c16l.A1P();
                                c16l.A1J();
                                if (c16l.A11() == C16R.A0G) {
                                    hashMap2.put(A1P, null);
                                } else {
                                    String A1P2 = c16l.A1P();
                                    if (A1P2 != null) {
                                        hashMap2.put(A1P, A1P2);
                                    }
                                }
                            }
                            hashMap = hashMap2;
                        }
                        C14360o3.A0B(hashMap, 0);
                        smartSuggestion.A07 = hashMap;
                    }
                    c16l.A0z();
                } else {
                    return smartSuggestion;
                }
            }
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
