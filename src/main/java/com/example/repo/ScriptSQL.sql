USE [PRUEBA]
GO

/****** Object:  Table [dbo].[CLIENTES_RONNY]    Script Date: 11/11/2022 17:27:09 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[CLIENTES_RONNY](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[PRIMER_NOMBRE] [varchar](30) NOT NULL,
	[SEGUNDO_NOMBRE] [varchar](30) NULL,
	[PRIMER_APELLIDO] [varchar](30) NOT NULL,
	[SEGUNDO_APELLIDO] [varchar](30) NULL,
	[SEXO] [varchar](1) NULL,
	[CELULAR] [int] NULL,
 CONSTRAINT [PK_CLIENTES_RONNY] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO

