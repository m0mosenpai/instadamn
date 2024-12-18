package X;

import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.reliability.UserFlowConfig;
import com.facebook.quicklog.reliability.UserFlowLoggerImpl;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.6yf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C155506yf {
    public long A00;
    public long A01;
    public long A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final UserFlowLoggerImpl A0A;
    public final UserSession A0B;

    public C155506yf(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A0B = userSession;
        this.A0A = new UserFlowLoggerImpl(C006802i.A0p);
    }

    public final void A03(String str) {
        C14360o3.A0B(str, 0);
        long A00 = A00(this, str);
        if (A00 != 0) {
            UserFlowLoggerImpl userFlowLoggerImpl = this.A0A;
            if (userFlowLoggerImpl.isOngoingFlow(A00)) {
                userFlowLoggerImpl.flowEndSuccess(A00);
            }
        }
    }

    public final void A04(String str) {
        long j;
        UserFlowLoggerImpl userFlowLoggerImpl;
        String str2;
        if (!str.equals("edit_full_name") && !str.equals("edit_user_name") && !str.equals("edit_bio")) {
            if (str.equals("edit_profile_picture")) {
                long j2 = this.A01;
                if (j2 != 0) {
                    boolean z = this.A05;
                    UserFlowLoggerImpl userFlowLoggerImpl2 = this.A0A;
                    if (z) {
                        userFlowLoggerImpl2.flowEndFail(j2, "Encountered Edit Profile Picture Failure", "");
                    } else {
                        userFlowLoggerImpl2.flowEndSuccess(j2);
                    }
                    this.A01 = 0L;
                    this.A05 = false;
                    return;
                }
                return;
            }
            if (str.equals("edit_link")) {
                j = this.A00;
                if (j == 0) {
                    return;
                }
                if (this.A09) {
                    userFlowLoggerImpl = this.A0A;
                    str2 = "Encountered Edit Profile Links Failure";
                    userFlowLoggerImpl.flowEndFail(j, str2, "");
                }
                this.A0A.flowEndSuccess(j);
            } else {
                if (!str.equals("edit_profile_link")) {
                    return;
                }
                j = this.A00;
                if (j == 0) {
                    return;
                }
                if (this.A09) {
                    userFlowLoggerImpl = this.A0A;
                    str2 = "Encountered Edit Profile Facebook Link Failure";
                    userFlowLoggerImpl.flowEndFail(j, str2, "");
                }
                this.A0A.flowEndSuccess(j);
            }
            this.A09 = false;
            this.A00 = 0L;
            return;
        }
        long j3 = this.A02;
        if (j3 == 0) {
            return;
        }
        if (!this.A04 && !this.A06 && !this.A03) {
            this.A0A.flowEndSuccess(j3);
        } else {
            this.A0A.flowEndFail(j3, "Encountered Edit Profile Form Failure", "");
        }
        this.A07 = false;
        this.A08 = false;
        this.A03 = false;
        this.A04 = false;
        this.A06 = false;
        this.A02 = 0L;
    }

    public final void A06(String str) {
        UserFlowLoggerImpl userFlowLoggerImpl;
        long j;
        String str2;
        UserFlowLoggerImpl userFlowLoggerImpl2;
        long generateNewFlowId;
        String str3;
        boolean equals = str.equals("edit_full_name");
        if (!equals && !str.equals("edit_user_name") && !str.equals("edit_bio")) {
            if (str.equals("edit_profile_picture")) {
                if (this.A01 == 0) {
                    this.A05 = false;
                    userFlowLoggerImpl = this.A0A;
                    long generateNewFlowId2 = userFlowLoggerImpl.generateNewFlowId(915547322);
                    this.A01 = generateNewFlowId2;
                    userFlowLoggerImpl.flowStart(generateNewFlowId2, new UserFlowConfig("edit_profile_picture", false));
                    userFlowLoggerImpl.flowAnnotate(this.A01, "profile_edit_category", str);
                    j = this.A01;
                    str2 = "edit_profile_picture_library_load";
                } else {
                    return;
                }
            } else {
                if (str.equals("edit_link")) {
                    if (this.A00 != 0) {
                        return;
                    }
                    this.A09 = false;
                    userFlowLoggerImpl2 = this.A0A;
                    generateNewFlowId = userFlowLoggerImpl2.generateNewFlowId(915541438);
                    this.A00 = generateNewFlowId;
                    str3 = "edit_profile_links";
                } else {
                    if (!str.equals("edit_profile_link") || this.A00 != 0) {
                        return;
                    }
                    this.A09 = false;
                    userFlowLoggerImpl2 = this.A0A;
                    generateNewFlowId = userFlowLoggerImpl2.generateNewFlowId(915541438);
                    this.A00 = generateNewFlowId;
                    str3 = "edit_profile_facebook_link";
                }
                userFlowLoggerImpl2.flowStart(generateNewFlowId, new UserFlowConfig(str3, false));
                return;
            }
        } else {
            if (this.A02 == 0) {
                UserFlowLoggerImpl userFlowLoggerImpl3 = this.A0A;
                long generateNewFlowId3 = userFlowLoggerImpl3.generateNewFlowId(915546946);
                this.A02 = generateNewFlowId3;
                userFlowLoggerImpl3.flowStart(generateNewFlowId3, new UserFlowConfig("edit_profile_form", false));
                userFlowLoggerImpl3.flowAnnotate(this.A02, "profile_edit_category", str);
            }
            if (equals) {
                this.A04 = false;
                this.A07 = true;
            } else {
                this.A06 = false;
                this.A08 = true;
            }
            userFlowLoggerImpl = this.A0A;
            j = this.A02;
            str2 = "edit_profile_form_load";
        }
        userFlowLoggerImpl.flowMarkPoint(j, str2);
    }

    public final void A07(String str, String str2) {
        C14360o3.A0B(str, 0);
        long A00 = A00(this, str);
        if (A00 != 0) {
            UserFlowLoggerImpl userFlowLoggerImpl = this.A0A;
            if (userFlowLoggerImpl.isOngoingFlow(A00)) {
                userFlowLoggerImpl.flowEndFail(A00, str2, "");
            }
        }
    }

    public final void A08(String str, String str2) {
        C14360o3.A0B(str, 0);
        long A00 = A00(this, str);
        if (A00 != 0) {
            UserFlowLoggerImpl userFlowLoggerImpl = this.A0A;
            if (userFlowLoggerImpl.isOngoingFlow(A00)) {
                userFlowLoggerImpl.flowMarkPoint(A00, str2);
            }
        }
    }

    public final void A09(String str, boolean z) {
        long j = this.A02;
        if (j != 0) {
            int hashCode = str.hashCode();
            if (hashCode != -609746934) {
                if (hashCode != -579725096) {
                    if (hashCode == 1983847949 && str.equals("name_successfully_edited")) {
                        this.A04 = false;
                    }
                } else if (str.equals("username_successfully_edited")) {
                    this.A06 = false;
                }
            } else if (str.equals("bio_successfully_edited")) {
                this.A03 = false;
            }
            UserFlowLoggerImpl userFlowLoggerImpl = this.A0A;
            userFlowLoggerImpl.flowAnnotate(j, "is_oepf", z);
            userFlowLoggerImpl.flowMarkPoint(this.A02, str);
        }
    }

    public static final long A00(C155506yf c155506yf, String str) {
        return c155506yf.A0A.generateFlowId(915549363, str.hashCode());
    }

    public static final void A01(C40781ul c40781ul, C155506yf c155506yf, long j) {
        Object obj;
        String str;
        if (c40781ul == null) {
            c155506yf.A0A.flowAnnotate(j, TraceFieldType.FailureReason, "Error response was null");
            return;
        }
        List list = c40781ul.mErrorStrings;
        if (list != null) {
            obj = list.get(0);
        } else {
            obj = null;
        }
        String str2 = "Missing failure reason";
        if (obj != null) {
            List list2 = c40781ul.mErrorStrings;
            if (list2 == null || (str2 = (String) list2.get(0)) == null) {
                str2 = "Null error in error string";
            }
        } else if (c40781ul.getErrorMessage() != null) {
            str2 = c40781ul.getErrorMessage();
            if (str2 == null) {
                str2 = "Null error message";
            }
        } else if ((c40781ul instanceof C32200ECv) && (str = ((C32200ECv) c40781ul).A01) != null) {
            str2 = str;
        }
        UserFlowLoggerImpl userFlowLoggerImpl = c155506yf.A0A;
        userFlowLoggerImpl.flowAnnotate(j, TraceFieldType.FailureReason, str2);
        String str3 = c40781ul.mErrorType;
        if (str3 != null) {
            userFlowLoggerImpl.flowAnnotate(j, "error_type", str3);
        }
        String errorCode = c40781ul.getErrorCode();
        if (errorCode != null) {
            userFlowLoggerImpl.flowAnnotate(j, TraceFieldType.ErrorCode, errorCode);
        }
        String str4 = c40781ul.mErrorSource;
        if (str4 == null) {
            return;
        }
        userFlowLoggerImpl.flowAnnotate(j, "error_source", str4);
    }

    public final void A02(String str) {
        long j = this.A00;
        if (j != 0) {
            this.A0A.flowAnnotate(j, TraceFieldType.FailureReason, str);
            this.A09 = true;
        }
    }

    public final void A05(String str) {
        long j = this.A01;
        if (j != 0) {
            this.A0A.flowMarkPoint(j, str);
        }
    }
}
