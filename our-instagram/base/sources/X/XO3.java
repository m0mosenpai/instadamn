package X;

import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.IntBuffer;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes12.dex */
public final class XO3 {
    public final int A00;
    public final Map A01;
    public final Map A02;
    public final Map A03;

    public final void A03(String str, Buffer buffer) {
        Map map = this.A01;
        if (map.containsKey(str)) {
            XO9 xo9 = (XO9) map.get(str);
            if (xo9 != null) {
                int i = xo9.A00;
                GLES20.glVertexAttribPointer(i, 2, 5126, false, 8, buffer);
                GLES20.glEnableVertexAttribArray(i);
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }

    public XO3(int i) {
        XO9 c72240XZt;
        this.A00 = i;
        int[] iArr = new int[1];
        int[] iArr2 = new int[1];
        int[] iArr3 = new int[1];
        int[] iArr4 = new int[1];
        int[] iArr5 = new int[1];
        GLES20.glGetProgramiv(i, 35718, iArr, 0);
        GLES20.glGetProgramiv(i, 35719, iArr2, 0);
        int i2 = iArr2[0];
        i2 = i2 < 256 ? 256 : i2;
        iArr2[0] = i2;
        byte[] bArr = new byte[i2];
        HashMap A1G = AbstractC166987dD.A1G();
        int i3 = iArr[0];
        for (int i4 = 0; i4 < i3; i4++) {
            GLES20.glGetActiveUniform(i, i4, iArr2[0], iArr3, 0, iArr4, 0, iArr5, 0, bArr, 0);
            String str = new String(bArr, 0, iArr3[0], C15W.A05);
            int glGetUniformLocation = GLES20.glGetUniformLocation(i, str);
            int i5 = iArr5[0];
            if (i5 != 5124) {
                if (i5 != 5126) {
                    if (i5 != 35678) {
                        if (i5 != 35680) {
                            if (i5 != 36198) {
                                switch (i5) {
                                    case 35664:
                                        c72240XZt = new C72239XZr(glGetUniformLocation);
                                        break;
                                    case 35665:
                                        c72240XZt = new XZs(glGetUniformLocation);
                                        break;
                                    case 35666:
                                        c72240XZt = new XO2(glGetUniformLocation);
                                        break;
                                    case 35667:
                                        c72240XZt = new C72241XZu(glGetUniformLocation);
                                        break;
                                    case 35668:
                                        c72240XZt = new C72242XZv(glGetUniformLocation);
                                        break;
                                    case 35669:
                                        c72240XZt = new XZw(glGetUniformLocation);
                                        break;
                                    case 35670:
                                        c72240XZt = new XOB(glGetUniformLocation);
                                        break;
                                    case 35671:
                                        c72240XZt = new C72237XZo(glGetUniformLocation);
                                        break;
                                    case 35672:
                                        c72240XZt = new XZp(glGetUniformLocation);
                                        break;
                                    case 35673:
                                        c72240XZt = new C72238XZq(glGetUniformLocation);
                                        break;
                                    default:
                                        switch (i5) {
                                            case 35675:
                                                c72240XZt = new XO9(glGetUniformLocation, 35675);
                                                break;
                                            case 35676:
                                                c72240XZt = new XO9(glGetUniformLocation, 35676);
                                                break;
                                            default:
                                                throw AbstractC166987dD.A14("Unrecognized type of uniform");
                                        }
                                }
                            } else {
                                c72240XZt = new XOS(glGetUniformLocation);
                            }
                        } else {
                            c72240XZt = new XZx(glGetUniformLocation);
                        }
                    } else {
                        c72240XZt = new XO8(glGetUniformLocation);
                    }
                } else {
                    c72240XZt = new XOM(glGetUniformLocation);
                }
            } else {
                c72240XZt = new C72240XZt(glGetUniformLocation);
            }
            A1G.put(str, c72240XZt);
        }
        this.A03 = A1G;
        int[] iArr6 = new int[1];
        int[] iArr7 = new int[1];
        int[] iArr8 = new int[1];
        int[] iArr9 = new int[1];
        int[] iArr10 = new int[1];
        GLES20.glGetProgramiv(i, 35721, iArr6, 0);
        GLES20.glGetProgramiv(i, 35722, iArr7, 0);
        int i6 = iArr7[0];
        i6 = i6 < 256 ? 256 : i6;
        iArr7[0] = i6;
        byte[] bArr2 = new byte[i6];
        HashMap A1G2 = AbstractC166987dD.A1G();
        int i7 = iArr6[0];
        for (int i8 = 0; i8 < i7; i8++) {
            GLES20.glGetActiveAttrib(i, i8, iArr7[0], iArr8, 0, iArr9, 0, iArr10, 0, bArr2, 0);
            String str2 = new String(bArr2, 0, iArr8[0], C15W.A05);
            A1G2.put(str2, new XO9(GLES20.glGetAttribLocation(i, str2), iArr10[0]));
        }
        this.A01 = A1G2;
        this.A02 = AbstractC166987dD.A1G();
    }

    public final void A00() {
        int i;
        int i2;
        int i3;
        IntBuffer intBuffer;
        int i4;
        IntBuffer intBuffer2;
        int i5;
        IntBuffer intBuffer3;
        int i6;
        IntBuffer intBuffer4;
        GLES20.glUseProgram(this.A00);
        Map map = this.A03;
        for (AbstractC72243XZy abstractC72243XZy : map.values()) {
            if (abstractC72243XZy.A00) {
                if (abstractC72243XZy instanceof XO2) {
                    XO2 xo2 = (XO2) abstractC72243XZy;
                    GLES20.glUniform4fv(((XO9) xo2).A00, 1, xo2.A00);
                } else {
                    if (abstractC72243XZy instanceof XOB) {
                        XOB xob = (XOB) abstractC72243XZy;
                        i6 = ((XO9) xob).A00;
                        intBuffer4 = xob.A00;
                    } else if (abstractC72243XZy instanceof C72236XZn) {
                        C72236XZn c72236XZn = (C72236XZn) abstractC72243XZy;
                        GLES20.glUniformMatrix4fv(((XO9) c72236XZn).A00, 1, false, c72236XZn.A00);
                    } else if (abstractC72243XZy instanceof XOM) {
                        XOM xom = (XOM) abstractC72243XZy;
                        GLES20.glUniform1fv(((XO9) xom).A00, 1, xom.A00);
                    } else if (abstractC72243XZy instanceof XOS) {
                        XOS xos = (XOS) abstractC72243XZy;
                        i6 = ((XO9) xos).A00;
                        intBuffer4 = xos.A00;
                    } else if (abstractC72243XZy instanceof XZx) {
                        XZx xZx = (XZx) abstractC72243XZy;
                        i6 = ((XO9) xZx).A00;
                        intBuffer4 = xZx.A00;
                    } else if (abstractC72243XZy instanceof XO8) {
                        XO8 xo8 = (XO8) abstractC72243XZy;
                        i6 = ((XO9) xo8).A00;
                        intBuffer4 = xo8.A00;
                    } else {
                        if (abstractC72243XZy instanceof XZw) {
                            XZw xZw = (XZw) abstractC72243XZy;
                            i5 = ((XO9) xZw).A00;
                            intBuffer3 = xZw.A00;
                        } else {
                            if (abstractC72243XZy instanceof C72242XZv) {
                                C72242XZv c72242XZv = (C72242XZv) abstractC72243XZy;
                                i4 = ((XO9) c72242XZv).A00;
                                intBuffer2 = c72242XZv.A00;
                            } else {
                                if (abstractC72243XZy instanceof C72241XZu) {
                                    C72241XZu c72241XZu = (C72241XZu) abstractC72243XZy;
                                    i3 = ((XO9) c72241XZu).A00;
                                    intBuffer = c72241XZu.A00;
                                } else if (abstractC72243XZy instanceof C72240XZt) {
                                    C72240XZt c72240XZt = (C72240XZt) abstractC72243XZy;
                                    i6 = ((XO9) c72240XZt).A00;
                                    intBuffer4 = c72240XZt.A00;
                                } else if (abstractC72243XZy instanceof XZs) {
                                    XZs xZs = (XZs) abstractC72243XZy;
                                    GLES20.glUniform3fv(((XO9) xZs).A00, 1, xZs.A00);
                                } else if (abstractC72243XZy instanceof C72239XZr) {
                                    C72239XZr c72239XZr = (C72239XZr) abstractC72243XZy;
                                    GLES20.glUniform2fv(((XO9) c72239XZr).A00, 1, c72239XZr.A00);
                                } else if (abstractC72243XZy instanceof C72235XZm) {
                                    GLES20.glUniformMatrix3fv(((XO9) abstractC72243XZy).A00, 1, false, null);
                                } else if (abstractC72243XZy instanceof C72238XZq) {
                                    C72238XZq c72238XZq = (C72238XZq) abstractC72243XZy;
                                    i5 = ((XO9) c72238XZq).A00;
                                    intBuffer3 = c72238XZq.A00;
                                } else if (abstractC72243XZy instanceof XZp) {
                                    XZp xZp = (XZp) abstractC72243XZy;
                                    i4 = ((XO9) xZp).A00;
                                    intBuffer2 = xZp.A00;
                                } else {
                                    C72237XZo c72237XZo = (C72237XZo) abstractC72243XZy;
                                    i3 = ((XO9) c72237XZo).A00;
                                    intBuffer = c72237XZo.A00;
                                }
                                GLES20.glUniform2iv(i3, 1, intBuffer);
                            }
                            GLES20.glUniform3iv(i4, 1, intBuffer2);
                        }
                        GLES20.glUniform4iv(i5, 1, intBuffer3);
                    }
                    GLES20.glUniform1iv(i6, 1, intBuffer4);
                }
                abstractC72243XZy.A00 = false;
            }
        }
        int i7 = 0;
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            XO9 xo9 = (XO9) entry.getValue();
            if (xo9.A01 == 35678) {
                Map map2 = this.A02;
                if (map2.containsKey(key)) {
                    Object obj = map2.get(key);
                    if (obj != null) {
                        XO4 xo4 = (XO4) obj;
                        GLES20.glUniform1i(xo9.A00, i7);
                        GLES20.glActiveTexture(33984 + i7);
                        GLES20.glBindTexture(3553, xo4.A01);
                        if (xo4.A00.intValue() != 0) {
                            i = 9729;
                        } else {
                            i = 9728;
                        }
                        GLES20.glTexParameteri(3553, 10241, i);
                        if (xo4.A00.intValue() != 0) {
                            i2 = 9729;
                        } else {
                            i2 = 9728;
                        }
                        GLES20.glTexParameteri(3553, 10240, i2);
                        GLES20.glTexParameteri(3553, 10242, 33071);
                        GLES20.glTexParameteri(3553, 10243, 33071);
                        i7++;
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else {
                    continue;
                }
            }
        }
    }

    public final void A01(Integer num, String str) {
        XO4 xo4;
        Map map = this.A02;
        if (map.containsKey(str) && (xo4 = (XO4) map.get(str)) != null) {
            xo4.A00 = num;
        }
    }

    public final void A02(String str, int i) {
        this.A02.put(str, new XO4(this, C05F.A01, i));
    }
}
