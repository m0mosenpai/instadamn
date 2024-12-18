package com.facebook.react.interfaces.exceptionmanager;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC25236BEt;
import X.AbstractC58317Pt9;
import X.C14360o3;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public interface ReactJsExceptionHandler {

    /* loaded from: classes5.dex */
    public interface ParsedError {

        /* loaded from: classes5.dex */
        public interface StackFrame {
            int getColumnNumber();

            String getFileName();

            int getLineNumber();

            String getMethodName();
        }

        int getExceptionId();

        List getFrames();

        String getMessage();

        boolean isFatal();
    }

    /* loaded from: classes5.dex */
    public final class ParsedErrorImpl implements ParsedError {
        public final int exceptionId;
        public final ArrayList frames;
        public final boolean isFatal;
        public final String message;

        public final ArrayList component1() {
            return this.frames;
        }

        public final String component2() {
            return this.message;
        }

        public final int component3() {
            return this.exceptionId;
        }

        public final boolean component4() {
            return this.isFatal;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof ParsedErrorImpl) {
                    ParsedErrorImpl parsedErrorImpl = (ParsedErrorImpl) obj;
                    if (!C14360o3.A0K(this.frames, parsedErrorImpl.frames) || !C14360o3.A0K(this.message, parsedErrorImpl.message) || this.exceptionId != parsedErrorImpl.exceptionId || this.isFatal != parsedErrorImpl.isFatal) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ ParsedErrorImpl copy$default(ParsedErrorImpl parsedErrorImpl, ArrayList arrayList, String str, int i, boolean z, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                arrayList = parsedErrorImpl.frames;
            }
            if ((i2 & 2) != 0) {
                str = parsedErrorImpl.message;
            }
            if ((i2 & 4) != 0) {
                i = parsedErrorImpl.exceptionId;
            }
            if ((i2 & 8) != 0) {
                z = parsedErrorImpl.isFatal;
            }
            AbstractC167017dG.A1N(arrayList, str);
            return new ParsedErrorImpl(arrayList, str, i, z);
        }

        public int hashCode() {
            return AbstractC166987dD.A0K(this.isFatal, (AbstractC166997dE.A0K(this.message, AbstractC166987dD.A0G(this.frames)) + this.exceptionId) * 31);
        }

        public ParsedErrorImpl(ArrayList arrayList, String str, int i, boolean z) {
            AbstractC167017dG.A1P(arrayList, str);
            this.frames = arrayList;
            this.message = str;
            this.exceptionId = i;
            this.isFatal = z;
        }

        public final ParsedErrorImpl copy(ArrayList arrayList, String str, int i, boolean z) {
            AbstractC167017dG.A1N(arrayList, str);
            return new ParsedErrorImpl(arrayList, str, i, z);
        }

        @Override // com.facebook.react.interfaces.exceptionmanager.ReactJsExceptionHandler.ParsedError
        public int getExceptionId() {
            return this.exceptionId;
        }

        @Override // com.facebook.react.interfaces.exceptionmanager.ReactJsExceptionHandler.ParsedError
        public ArrayList getFrames() {
            return this.frames;
        }

        @Override // com.facebook.react.interfaces.exceptionmanager.ReactJsExceptionHandler.ParsedError
        public String getMessage() {
            return this.message;
        }

        @Override // com.facebook.react.interfaces.exceptionmanager.ReactJsExceptionHandler.ParsedError
        public boolean isFatal() {
            return this.isFatal;
        }

        public String toString() {
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append("ParsedErrorImpl(frames=");
            A1C.append(this.frames);
            A1C.append(AbstractC58317Pt9.A00(59));
            A1C.append(this.message);
            A1C.append(", exceptionId=");
            A1C.append(this.exceptionId);
            A1C.append(", isFatal=");
            return AbstractC25236BEt.A0a(A1C, this.isFatal);
        }

        @Override // com.facebook.react.interfaces.exceptionmanager.ReactJsExceptionHandler.ParsedError
        public /* bridge */ /* synthetic */ List getFrames() {
            return this.frames;
        }
    }

    /* loaded from: classes5.dex */
    public final class ParsedStackFrameImpl implements ParsedError.StackFrame {
        public final int columnNumber;
        public final String fileName;
        public final int lineNumber;
        public final String methodName;

        public final String component1() {
            return this.fileName;
        }

        public final String component2() {
            return this.methodName;
        }

        public final int component3() {
            return this.lineNumber;
        }

        public final int component4() {
            return this.columnNumber;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof ParsedStackFrameImpl) {
                    ParsedStackFrameImpl parsedStackFrameImpl = (ParsedStackFrameImpl) obj;
                    if (!C14360o3.A0K(this.fileName, parsedStackFrameImpl.fileName) || !C14360o3.A0K(this.methodName, parsedStackFrameImpl.methodName) || this.lineNumber != parsedStackFrameImpl.lineNumber || this.columnNumber != parsedStackFrameImpl.columnNumber) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ ParsedStackFrameImpl copy$default(ParsedStackFrameImpl parsedStackFrameImpl, String str, String str2, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = parsedStackFrameImpl.fileName;
            }
            if ((i3 & 2) != 0) {
                str2 = parsedStackFrameImpl.methodName;
            }
            if ((i3 & 4) != 0) {
                i = parsedStackFrameImpl.lineNumber;
            }
            if ((i3 & 8) != 0) {
                i2 = parsedStackFrameImpl.columnNumber;
            }
            AbstractC167017dG.A1N(str, str2);
            return new ParsedStackFrameImpl(str, str2, i, i2);
        }

        public int hashCode() {
            return ((AbstractC166997dE.A0K(this.methodName, AbstractC166987dD.A0J(this.fileName)) + this.lineNumber) * 31) + this.columnNumber;
        }

        public ParsedStackFrameImpl(String str, String str2, int i, int i2) {
            AbstractC167017dG.A1P(str, str2);
            this.fileName = str;
            this.methodName = str2;
            this.lineNumber = i;
            this.columnNumber = i2;
        }

        public final ParsedStackFrameImpl copy(String str, String str2, int i, int i2) {
            AbstractC167017dG.A1N(str, str2);
            return new ParsedStackFrameImpl(str, str2, i, i2);
        }

        @Override // com.facebook.react.interfaces.exceptionmanager.ReactJsExceptionHandler.ParsedError.StackFrame
        public int getColumnNumber() {
            return this.columnNumber;
        }

        @Override // com.facebook.react.interfaces.exceptionmanager.ReactJsExceptionHandler.ParsedError.StackFrame
        public String getFileName() {
            return this.fileName;
        }

        @Override // com.facebook.react.interfaces.exceptionmanager.ReactJsExceptionHandler.ParsedError.StackFrame
        public int getLineNumber() {
            return this.lineNumber;
        }

        @Override // com.facebook.react.interfaces.exceptionmanager.ReactJsExceptionHandler.ParsedError.StackFrame
        public String getMethodName() {
            return this.methodName;
        }

        public String toString() {
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append("ParsedStackFrameImpl(fileName=");
            A1C.append(this.fileName);
            A1C.append(", methodName=");
            A1C.append(this.methodName);
            A1C.append(", lineNumber=");
            A1C.append(this.lineNumber);
            A1C.append(", columnNumber=");
            return AbstractC25236BEt.A0Z(A1C, this.columnNumber);
        }
    }

    void reportJsException(ParsedError parsedError);
}
