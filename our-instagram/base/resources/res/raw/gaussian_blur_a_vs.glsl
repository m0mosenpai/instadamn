#ifdef GL_FRAGMENT_PRECISION_HIGH
precision highp float;
#else
precision mediump float;
#endif
attribute vec4 aPosition;
attribute vec4 aTextureCoord;

// built-in uniforms
uniform mat4 uSurfaceTransformMatrix; //Applied to the texture coordinates
uniform mat4 uSceneTransformMatrix; //Applied to the whole scene
uniform mat4 uVideoTransformMatrix; //Applied to the video geometry

varying vec2 vTexCoords;

void main()
{
	gl_Position = aPosition;
  vTexCoords = (uSurfaceTransformMatrix * uVideoTransformMatrix * uSceneTransformMatrix * vec4(aTextureCoord.x, 1.0 - aTextureCoord.y, 1.0, 1.0)).xy;
}
